def transponer_matriz(matriz):
  """
  Transpone una matriz y devuelve la matriz transpuesta.
  """
  filas = len(matriz)
  columnas = len(matriz[0])
  matriz_transpuesta = []
  for j in range(columnas):
    fila = []
    for i in range(filas):
      fila.append(matriz[i][j])
    matriz_transpuesta.append(fila)
  return matriz_transpuesta

# Definir una matriz
matriz = [[1, 2, 3], [4, 5, 6]]

# Transponer la matriz
matriz_transpuesta = transponer_matriz(matriz)

# Mostrar la matriz transpuesta
for fila in matriz_transpuesta:
  print(fila)