import os
from MD5 import Checksum

path = "src/main/"

def createTotalChecksum():
    sums = []
    for r, d, f in os.walk(path):
        for file in f:
            sum = Checksum(os.path.join(r, file))
            sums.append(sum.createChecksum()[1])
    return Checksum.createStaticChecksum(sums)
with open("checksum.txt", "w+") as f:
    f.write(createTotalChecksum())
    f.flush()
    f.close()
