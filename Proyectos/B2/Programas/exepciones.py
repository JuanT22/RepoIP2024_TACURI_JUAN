try:
    numero1 = int(input("Ingresa un número: "))
    numero2 = int(input("Ingresa otro número: "))
    resultado = numero1 / numero2
    print("El resultado es:", resultado)
except ZeroDivisionError:
    print("Error: No se puede dividir por cero.")
except ValueError:
    print("Error: Ingresa solo números enteros.")
finally:
    print("Fin del programa.")