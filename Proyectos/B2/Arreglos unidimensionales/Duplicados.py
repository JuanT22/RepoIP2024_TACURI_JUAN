# Crear una lista con elementos duplicados
numeros = [1, 2, 2, 3, 4, 4, 5, 6, 6, 7]

# Crear una nueva lista sin duplicados
numeros_unicos = []
for numero in numeros:
  if numero not in numeros_unicos:
    numeros_unicos.append(numero)

# Mostrar el resultado
print("La lista original es:", numeros)
print("La lista sin duplicados es:", numeros_unicos)