def es_primo(numero):
  """
  Determina si un número es primo.
  """
  if numero <= 1:
    return False
  for i in range(2, int(numero**0.5) + 1):
    if numero % i == 0:
      return False
  return True

# Obtener el rango del usuario
inicio = int(input("Ingresa el número de inicio: "))
fin = int(input("Ingresa el número de fin: "))

print("Los números primos entre", inicio, "y", fin, "son:")
for numero in range(inicio, fin + 1):
  if es_primo(numero):
    print(numero)