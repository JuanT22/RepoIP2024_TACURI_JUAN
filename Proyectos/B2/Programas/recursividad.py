def factorial(n):
  """
  Esta función calcula el factorial de un número entero no negativo.
  """
  if n == 0:  # Caso base: factorial de 0 es 1
    return 1
  else:
    return n * factorial(n - 1)  # Llamada recursiva

# Ejemplo de uso
numero = 5
resultado = factorial(numero)
print("El factorial de", numero, "es:", resultado)  # Salida: El factorial de 5 es: 120