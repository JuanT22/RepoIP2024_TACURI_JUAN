def imprimir_rectangulo(ancho, alto):
  """
  Imprime un rectángulo con asteriscos.
  """
  for i in range(alto):
    for j in range(ancho):
      print("*", end="")
    print()

# Obtener el ancho y alto del rectángulo del usuario
ancho = int(input("Ingresa el ancho del rectángulo: "))
alto = int(input("Ingresa el alto del rectángulo: "))

# Imprimir el rectángulo
imprimir_rectangulo(ancho, alto)