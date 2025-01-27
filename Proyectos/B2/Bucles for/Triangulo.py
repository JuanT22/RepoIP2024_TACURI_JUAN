# Obtener el número de filas del usuario
filas = int(input("Ingresa el número de filas: "))

# Imprimir el patrón
for i in range(1, filas + 1):
  for j in range(1, i + 1):
    print("*", end="")
  print()