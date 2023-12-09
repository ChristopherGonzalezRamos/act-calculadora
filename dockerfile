# Usamos una imagen base que contiene las herramientas de compilación de Java
FROM openjdk:11

# Copiamos el código fuente de la aplicación Java a la imagen
COPY src/ /app

# Establecemos el directorio de trabajo
WORKDIR /app

# Compilamos la aplicación Java
RUN javac Main.java

# Comando para ejecutar la aplicación Java compilada
CMD ["java", "Main"]