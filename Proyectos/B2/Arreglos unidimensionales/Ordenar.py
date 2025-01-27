# Crear una lista de números
numeros = [5, 2, 8, 1, 9, 4]

# Ordenar la lista usando el algoritmo de burbuja
n = len(numeros)
for i in range(n):
  for j in range(0, n-i-1):
    if numeros[j] > numeros[j+1]:
      numeros[j], numeros[j+1] = numeros[j+1], numeros[j]

# Mostrar el resultado
print("La lista ordenada es:", numeros)