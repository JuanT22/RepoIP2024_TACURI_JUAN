# Obtener peso y altura del usuario
peso = float(input("Ingresa tu peso en kilogramos: "))
altura = float(input("Ingresa tu altura en metros: "))

# Calcular el IMC
imc = peso / (altura ** 2)

# Interpretar el IMC
if imc < 18.5:
    interpretacion = "Bajo peso"
elif imc < 25:
    interpretacion = "Peso normal"
elif imc < 30:
    interpretacion = "Sobrepeso"
else:
    interpretacion = "Obesidad"

# Mostrar el resultado
print("Tu IMC es:", imc)
print("Interpretación:", interpretacion)