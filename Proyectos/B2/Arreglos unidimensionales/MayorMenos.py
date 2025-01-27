# Crear una lista de números
numeros = [3, 8, 1, 9, 4, 2, 7, 5, 6]

# Inicializar las variables mayor y menor con el primer elemento de la lista
mayor = numeros[0]
menor = numeros[0]

# Recorrer la lista y actualizar las variables mayor y menor
for numero in numeros:
  if numero > mayor:
    mayor = numero
  if numero < menor:
    menor = numero

# Mostrar el resultado
print("El elemento mayor de la lista es:", mayor)
print("El elemento menor de la lista es:", menor)