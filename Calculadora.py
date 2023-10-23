def main ():
    print("Calculadora")

    print("Ingresa el primer número...")
    primernum = int(input())
    print("Ingresa el segundo número...")
    segundonum = int(input())

    opcion = 0
    while True:
        print("Qué operación deseas realizar")
        print("1) Sumar")
        print("2) Restar")
        print("3) Multiplicar")
        print("4) Dividir")
        print("5) Salir")
        
        opcion = int(input("Elige una opción: ") )
        if opcion == 1:
            suma = primernum + segundonum
            print("La suma es igual a: ", suma)
        elif opcion == 2:
            resta = primernum - segundonum
            print("La resta es igual a: ", resta)
        elif opcion == 3:
            multiplicacion = primernum * segundonum
            print("La multiplicación es igual a: ", multiplicacion)
        elif opcion == 4:
            try:
                dividir = primernum / segundonum
                print("La resta es igual a: ", dividir)
            except ZeroDivisionError:
                print("Error: No se puede dividir entre cero.")
            
        elif opcion == 5:
            break
        else:
            print("Opción incorrecta")
        
   

if __name__ == "__main__": 
    main()