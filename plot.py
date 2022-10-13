import numpy as np
import matplotlib.pyplot as plt
  
x = []
y = []
j=0
for line in open('new4.txt', 'r'):
    lines = [i for i in line.split()]
    j=j+1
    x.append(j)
    y.append(int(lines[1]))
      
plt.title("Nodes allowed to transmit 3 times")
plt.xlabel('Time')
plt.ylabel('Number of nodes that transmited')
plt.tick_params(axis='y',labelsize = 10)
plt.plot(x, y, c = 'y')
  
plt.grid()
plt.show()


