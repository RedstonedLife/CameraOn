import os
from MD5 import Checksum

path = "src/main/"

for r, d, f in os.walk(path):
    for file in f:
        sum = Checksum(os.path.join(r, file))
        print(sum.createChecksum()[0])
