import hashlib, os

class Checksum:
    def __init__(self, file_path: str) -> None:
        self.file_path = file_path

    def createChecksum(self) -> str:
        with open(self.file_path, "rb") as f:
            hash = hashlib.md5()
            while chunk := f.read(8192):
                hash.update(chunk)
        return hash.hexdigest()

    def createSha1(self) -> str:
        with open(self.file_path, "rb") as f:
            hash = hashlib.sha1()
            while chunk := f.read(8192):
                hash.update(chunk)
        return hash.hexdigest()

    def createSha256(self) -> str:
        with open(self.file_path, "rb") as f:
            hash = hashlib.sha256()
            while chunk := f.read(8192):
                hash.update(chunk)
        return hash.hexdigest()

    def createPBKDF2HMAC(self, salt: bytes, app_iters: int) -> str:
        hash_upper = hashlib.sha512()
        with open(self.file_path, "rb") as f:
            while chunk := f.read(8192):
                hash_upper.update(hashlib.pbkdf2_hmac('sha256', chunk, salt, app_iters))
        return hash_upper.hexdigest()

    @staticmethod
    def createStaticChecksum(hashes: tuple) -> str:
        hash = hashlib.md5()
        for h in hashes:
            hash.update(bytes(h, 'utf8'))
        return hash.hexdigest()

    @staticmethod
    def createStaticSha1(hashes: tuple) -> str:
        hash = hashlib.sha1()
        for h in hashes:
            hash.update(bytes(h, 'utf8'))
        return hash.hexdigest()

    @staticmethod
    def createStaticSha256(hashes: tuple) -> str:
        hash = hashlib.sha256()
        for h in hashes:
            hash.update(bytes(h, 'utf8'))
        return hash.hexdigest()

    @staticmethod
    def createStaticPBKDF2HMAC(hashes: tuple, salt: bytes, app_iters: int) -> str:
        hash = hashlib.sha512()
        for h in hashes:
            hash.update(hashlib.pbkdf2_hmac('sha512', bytes(h, 'utf8'), salt, app_iters))
        return hashlib.pbkdf2_hmac('sha256', bytes(hash.hexdigest(), 'utf8'), salt, app_iters).hex()
