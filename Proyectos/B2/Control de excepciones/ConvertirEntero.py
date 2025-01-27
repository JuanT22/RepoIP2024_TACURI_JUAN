def convertir_a_entero(cadena):
  """
  Intenta convertir una cadena de texto a un número entero.
  Maneja la excepción ValueError si la cadena no es un número válido.
  """
  try:
    numero = int(cadena)
    print("La cadena se convirtió a entero:", numero)
  except ValueError:
    print("Error: La cadena no es un número entero válido.")

# Obtener una cadena del usuario
cadena = input("Ingresa una cadena de texto: ")

# Intentar convertir la cadena a entero
convertir_a_entero(cadena)