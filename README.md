# Dev-BackOffice-Challenge-002

Este repositorio corresponde al reto técnico **Dev BackOffice Challenge 002**.

## ⚠️ Nota sobre esta entrega

La entrega de este proyecto fue realizada fuera del plazo originalmente estipulado (72 horas desde la convocatoria). A pesar de una prórroga otorgada hasta el 25 de abril a las 10:00 - 11:00 A.M., no logré completar a tiempo la integración con la base de datos debido a errores que continúan sin resolverse completamente. 

He decidido entregar los avances actuales con la intención de mostrar mi enfoque, estructura de trabajo y compromiso con el reto.

Gracias por la oportunidad y comprensión.

---

## ✅ Avances implementados

- Proyecto backend en **Java** con Spring Boot.
- Configuración de autenticación básica con usuario/contraseña.
- Estructura base siguiendo convenciones **REST**.
- Implementación parcial de logs con `Logger`.
- Configuración del archivo `application.properties`.
- Modelo de entidad con JPA listo.
- Repositorio y controlador esqueleto iniciado.
- Gestión de errores en estructura base.

---

## ⚙️ Requisitos técnicos (parcialmente cubiertos)

- [x] Java + Spring Boot
- [x] Dependencias gestionadas con **Maven**
- [x] Estructura REST con uso correcto de verbos HTTP
- [x] Logs de acceso habilitados
- [x] Control de errores y respuestas consistentes
- [ ] Sesión/token con vigencia de 10 minutos (en desarrollo)
- [ ] Implementación completa de JPA (en proceso)
- [ ] Ejemplos en Postman/Insomnia (pendiente)
- [ ] Documentación detallada de endpoints (pendiente)

---

## 🚀 Requisitos para compilar

### Herramientas necesarias:
- Java 8 o 
- Maven 3.9.9
- IDE recomendado: IntelliJ IDEA o VS Code con extensiones de Java

### Conexión 
http://localhost:8080

### Pasos para compilar:
```bash
git clone https://github.com/AldesQuintero/Dev-BackOffice-Challenge-002.git
cd Dev-BackOffice-Challenge-002
git checkout entrega-tardia
mvn clean install
mvn spring-boot:run

