import os
from os.path import exists
from MD5 import Checksum

path = "src/main/"
salt = None
salt64 = None

cSalt = True if input('Generate new 32 byte salt? (Y/N): ').lower()[0] == 'y' else False
cSalt64 =True if input('Generate new 64 byte salt? (Y/N): ').lower()[0] == 'y' else False

if not exists('32byte.salt') or cSalt:
    with open('32byte.salt', 'wb+') as f:
        f.write(os.urandom(32))
        f.flush()
        f.close()
if not exists('64byte.salt') or cSalt64:
    with open('64byte.salt', 'wb+') as f:
        f.write(os.urandom(64))
        f.flush()
        f.close()

with open('32byte.salt', 'rb') as f:
    salt = f.read()
with open('64byte.salt', 'rb') as f:
    salt64 = f.read()

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
def createTotalSha512():
    sums = []
    for r, d, f in os.walk(path):
        for file in f:
            sum = Checksum(os.path.join(r, file))
            sums.append(sum.createSha512())
    return Checksum.createStaticSha512(sums)
def createTotalShaPBKDF2HMAC():
    sums = []
    for r, d, f in os.walk(path):
        for file in f:
            sum = Checksum(os.path.join(r, file))
            sums.append(sum.createPBKDF2HMAC(salt, 500))
    return Checksum.createStaticPBKDF2HMAC(sums, salt, 500)
def createTotalShaPBKDF2HMAC64():
    sums = []
    for r, d, f in os.walk(path):
        for file in f:
            sum = Checksum(os.path.join(r, file))
            sums.append(sum.createPBKDF2HMAC(salt64, 500))
    return Checksum.createStaticPBKDF2HMAC(sums, salt64, 500)


with open("checksum.txt", "w+") as f:
    mdc = createTotalChecksum()
    sha1 = createTotalSha()
    sha256 = createTotalSha256()
    sha512 = createTotalSha512()
    pbd = createTotalShaPBKDF2HMAC()
    pbd64 = createTotalShaPBKDF2HMAC64()
    f.write(f"SALT (32 bytes): {salt.hex()}\nSALT (64 bytes): {salt64.hex()}\nMD5 Sum: {mdc}\nSHA1 Sum: {sha1}\nSHA256 Sum: {sha256}\nSHA512 Sum: {sha512}\nPBKDF2_HMAC Salted Sum: {pbd}\nPBKDF2HMAC Salt 64 Sum: {pbd64}")
    f.flush()
    f.close()
