# Trabajo-Practico-Fundamentos-de-Spring-Boot

## Descripción del proyecto
Este trabajo práctico introduce los fundamentos de **Spring Boot**, mostrando qué lo hace diferente de **Spring Framework tradicional** y guiando la creación de un primer proyecto funcional.

A través de tres actividades se recorren los conceptos esenciales:
1. Primeros pasos en Spring Boot
2. Fundamentos de Spring (Application Context, Beans, IoC, DI)
3. La magia de Spring Boot (autoconfiguración, profiles, starters)

---

## Tecnologías utilizadas
- **Lenguaje:** Java 21
- **Framework:** Spring Boot 3.5.7
- **Servidor embebido:** Apache Tomcat 10
- **Logging:** SLF4J + Logback
- **Herramienta de inicialización:** Spring Initializr
  🚀 Instrucciones para clonar y ejecutar
  Sigue estos pasos para clonar y ejecutar el proyecto en tu máquina local.

---
## Clonar el repositorio
1. abrir cmd:
2. git clone https://github.com/SntLF02/Trabajo-Practico-Fundamentos-de-Spring-Boot.git

---
## Ejecución del proyecto

1. Abrir el proyecto en tu IDE (IntelliJ, VS Code, Eclipse).
2. Ejecutar la clase principal:
   src/main/java/com/miempresa/tutorial/mi_primer_spring_boot/MiPrimerSpringBootApplication.java
3. Acceder en el navegador a:
   http://localhost:8080/hello
4. Respuesta esperada:
   Hola, Spring Boot autoconfigurado!

---

## Cómo cambiar entre profiles

Spring Boot permite definir configuraciones específicas para distintos entornos (`dev`, `test`, `prod`) mediante **profiles**.

1. Crear archivos de configuración:
- `application-dev.yml`
- `application-prod.yml`
- `application-test.yml`

2. Activar un profile en `application.yml`:
```yaml
spring:
  profiles:
    active: dev
```
Al reiniciar la aplicación, se aplicará la configuración del profile activo.

---

Spring Boot simplifica el desarrollo eliminando configuraciones manuales y permitiendo enfocarse en la lógica de negocio. La autoconfiguración, los starters y la facilidad de creación de proyectos con Spring Initializr hacen que el desarrollo sea ágil y productivo. El uso de profiles y la inyección de dependencias promueven aplicaciones escalables, mantenibles y fáciles de probar.

En conclusión, Spring Boot ofrece una experiencia de desarrollo moderna y eficiente, ideal para proyectos que buscan rapidez, claridad y escalabilidad.

Autor
Santiago López Legajo: 52686