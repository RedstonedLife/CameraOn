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

    @staticmethod
    def createStaticChecksum(hashes: tuple) -> str:
        hash = hashlib.md5()
        for h in hashes:
            hash.update(bytes(h, 'utf8'))
        return hash.hexdigest()
