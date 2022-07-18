import os
from MD5 import Checksum

path = "src/main/"
salt = os.urandom(32)

def createTotalChecksum():
    sums = []
    for r, d, f in os.walk(path):
        for file in f:
            sum = Checksum(os.path.join(r, file))
            sums.append(sum.createChecksum())
    return Checksum.createStaticChecksum(sums)
def createTotalSha():
    sums = []
    for r, d, f in os.walk(path):
        for file in f:
            sum = Checksum(os.path.join(r, file))
            sums.append(sum.createSha1())
    return Checksum.createStaticSha1(sums)
def createTotalSha256():
    sums = []
    for r, d, f in os.walk(path):
        for file in f:
            sum = Checksum(os.path.join(r, file))
            sums.append(sum.createSha256())
    return Checksum.createStaticSha256(sums)
def createTotalShaPBKDF2HMAC():
    sums = []
    for r, d, f in os.walk(path):
        for file in f:
            sum = Checksum(os.path.join(r, file))
            sums.append(sum.createPBKDF2HMAC(salt, 500))
    return Checksum.createStaticPBKDF2HMAC(sums, salt, 500)

with open("checksum.txt", "w+") as f:
    mdc = createTotalChecksum()
    sha1 = createTotalSha()
    sha256 = createTotalSha256()
    pbd = createTotalShaPBKDF2HMAC()
    f.write(f"SALT (32 bytes): {salt.hex()}\nMD5 Sum: {mdc}\nSHA1 Sum: {sha1}\nSHA256 Sum: {sha256}\nPBKDF2_HMAC Salted Sum: {pbd}")
    f.flush()
    f.close()
