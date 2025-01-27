def crear_matriz_identidad(n):
  """
  Crea una matriz identidad de tamaño n x n.
  """
  matriz = []
  for i in range(n):
    fila = []
    for j in range(n):
      if i == j:
        fila.append(1)
      else:
        fila.append(0)
    matriz.append(fila)
  return matriz

# Obtener el tamaño de la matriz del usuario
n = int(input("Ingresa el tamaño de la matriz identidad: "))

# Crear la matriz identidad
matriz_identidad = crear_matriz_identidad(n)

# Mostrar la matriz identidad
for fila in matriz_identidad:
  print(fila)