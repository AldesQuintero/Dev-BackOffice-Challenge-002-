# 📌 Dev BackOffice Challenge 002 - Entrega Inicial

**Repositorio:** [Dev-BackOffice-Challenge-002](https://github.com/AldesQuintero/Dev-BackOffice-Challenge-002-)

---

## ✨ Descripción del proyecto

Este proyecto fue desarrollado como parte del reto técnico para la posición de desarrollo backend.  
La estructura base del proyecto está construida con **Java 8**, **Spring Boot** y **Maven** como gestor de dependencias.  
El enfoque principal estuvo en la correcta definición de entidades base y estructura de capas para futuras implementaciones.

---

## 📦 Tecnologías utilizadas

- Java 8  
- Spring Boot  
- Maven 3.9.9  
- JPA / Hibernate  
- MSSQL (SQL Server)

---

## 🛠️ Estado del desarrollo

Si bien no se logró la implementación completa de todas las funcionalidades solicitadas dentro del plazo inicial, el proyecto cuenta con:

- Estructura base organizada en paquetes:  
  `controller`, `service`, `repository`, `entity`, etc.
- Entidades implementadas:
  - `Usuario`
  - `Categoría`
  - `Producto`
  - `Bitácora`
  - `NivelAcceso`
- Configuración parcial del sistema de autenticación y logs
- Integración parcial entre capas (algunos servicios y controladores aún pendientes)

---

## 🚧 Problemas encontrados

Durante el desarrollo surgieron algunos desafíos técnicos relacionados con:

- Errores en la integración entre capas (Controller ↔ Service ↔ Repository)
- Problemas en la conexión con la base de datos

---

## 🔄 Próximos pasos sugeridos

- Finalizar la implementación de los controladores y servicios
- Terminar lógica de autenticación y expiración de sesión
- Implementar logs de acceso y control de errores personalizados
- Agregar pruebas con Postman

---

## 📂 Instrucciones básicas

1. Clonar el repositorio:  
   ```bash
   git clone https://github.com/AldesQuintero/Dev-BackOffice-Challenge-002-.git

