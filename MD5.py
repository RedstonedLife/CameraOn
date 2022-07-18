import hashlib

class Checksum:
    def __init__(self, file_path: str) -> None:
        self.file_path = file_path

    def createChecksum(self) -> str:
        with open(self.file_path, "rb") as f:
            hash = hashlib.md5()
            while chunk := f.read(8192):
                hash.update(chunk)
        return (hash.digest(), hash.hexdigest())
