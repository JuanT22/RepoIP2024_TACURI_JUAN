calificaciones = [
    [8, 9, 7, 10],  # Calificaciones del estudiante 1
    [7, 6, 8, 9],   # Calificaciones del estudiante 2
    [9, 10, 8, 7]   # Calificaciones del estudiante 3
]

# Calcular el promedio de un estudiante (por ejemplo, el estudiante 2)
promedio_estudiante_2 = sum(calificaciones[1]) / len(calificaciones[1])
print("Promedio del estudiante 2:", promedio_estudiante_2)