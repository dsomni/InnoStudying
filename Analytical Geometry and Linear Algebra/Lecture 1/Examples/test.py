import numpy as np
import matplotlib.pyplot as plt
from PIL import Image

# import picture
pic = Image.open('images-2.jpeg')

pic = pic.convert('L')
# let's have a look
plt.imshow(pic,cmap='gray')
#plt.show()
pic = np.array(pic)

U,S,V = np.linalg.svd( pic )

# plot the spectrum
plt.plot(S,'r-')
plt.xlim([-2,270])
plt.xlabel('Component number')
plt.ylabel('Singular value (\sigma)')
plt.show()
print(S[:15])