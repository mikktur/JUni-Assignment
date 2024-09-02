### Explain how assertArrayEquals works and what it checks when comparing arrays.
it check if the arrays are the same length,type and the values are exactly the same.
### . What will happen if the arrays a1 and a2 are not equal in testSingleDimensionalArrayEquality?

The test will fail and it will inform the expected result and the actual result. ie "array Lenghts differ etc"

### How does the assertArrayEquals method handle multi-dimensional arrays as seen in testMultiDimensionalArrayEquality?

it handles it by testing the array recursively. In layman terms it uses the single array test logic multiple times for each dimension.