def leer_archivo(nombre_archivo):
  """
  Intenta abrir y leer un archivo.
  Maneja la excepción FileNotFoundError si el archivo no existe.
  """
  try:
    with open(nombre_archivo, 'r') as archivo:
      contenido = archivo.read()
      print("El contenido del archivo es:\n", contenido)
  except FileNotFoundError:
    print("Error: El archivo no se encontró.")

# Obtener el nombre del archivo del usuario
nombre_archivo = input("Ingresa el nombre del archivo: ")

# Intentar leer el archivo
leer_archivo(nombre_archivo)