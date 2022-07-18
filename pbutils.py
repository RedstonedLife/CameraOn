import os
from MD5 import Checksum

path = "src/main/"
password = bytes(input("Create a hashing Password: "), 'utf8')
salt = os.urandom(32)
print(salt)

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
print(createTotalShaPBKDF2HMAC())
exit(0)
with open("checksum.txt", "w+") as f:
    f.write(createTotalChecksum() + "\n" + createTotalSha() + "\n" + createTotalSha256())
    f.flush()
    f.close()
