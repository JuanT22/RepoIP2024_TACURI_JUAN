# Obtener el precio y el tipo de cliente del usuario
precio = float(input("Ingresa el precio del producto: "))
print("1) Estudiante\n2)Jubilado\n3)Otro")
tipo_cliente = int(input("Ingresa el tipo de cliente: "))

# Calcular el precio final
if tipo_cliente == 1:
    descuento = 0.10  # 10% de descuento
elif tipo_cliente == 2:
    descuento = 0.15  # 15% de descuento
else:
    descuento = 0  # Sin descuento

precio_final = precio * (1 - descuento)

# Mostrar el resultado
print("El precio final es:", precio_final)