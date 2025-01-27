def sumar_matrices(matriz1, matriz2):
  """
  Suma dos matrices y devuelve la matriz resultante.
  """
  filas = len(matriz1)
  columnas = len(matriz1[0])
  matriz_suma = []
  for i in range(filas):
    fila = []
    for j in range(columnas):
      fila.append(matriz1[i][j] + matriz2[i][j])
    matriz_suma.append(fila)
  return matriz_suma

# Definir dos matrices
matriz1 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
matriz2 = [[9, 8, 7], [6, 5, 4], [3, 2, 1]]

# Sumar las matrices
matriz_resultado = sumar_matrices(matriz1, matriz2)

# Mostrar la matriz resultante
for fila in matriz_resultado:
  print(fila)