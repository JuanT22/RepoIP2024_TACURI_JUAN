def dividir_numeros(num1, num2):
  """
  Divide dos números y maneja la excepción ZeroDivisionError 
  si el segundo número es cero.
  """
  try:
    resultado = num1 / num2
    print("El resultado de la división es:", resultado)
  except ZeroDivisionError:
    print("Error: No se puede dividir por cero.")

# Obtener dos números del usuario
num1 = int(input("Ingresa el primer número: "))
num2 = int(input("Ingresa el segundo número: "))

# Dividir los números
dividir_numeros(num1, num2)