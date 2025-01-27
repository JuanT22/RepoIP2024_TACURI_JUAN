def imprimir_numeros_descendente(n):
  """
  Imprime los números desde n hasta 1 de forma recursiva.
  """
  if n <= 0:  # Caso base: detener la recursión cuando n llega a 0
    return
  else:
    print(n)  # Imprimir el número actual
    imprimir_numeros_descendente(n - 1)  # Llamar a la función con n-1

# Obtener un número del usuario
numero = int(input("Ingresa un número entero positivo: "))

# Imprimir los números descendentemente
imprimir_numeros_descendente(numero)