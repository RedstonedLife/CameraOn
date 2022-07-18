import hashlib

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
