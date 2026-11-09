# Actividad 2: Patrón MVC con Spring Boot y Thymeleaf

Este proyecto es la continuación (copia) de la Actividad 1, en la cual se implementa el patrón Modelo-Vista-Controlador (MVC) utilizando **Spring Boot** y **Thymeleaf** para renderizar vistas del lado del servidor. Además, se incluye el manejo de DTOs, parámetros de peticiones y configuración de propiedades externas.

## 🛠️ Tecnologías utilizadas
* Java 25
* Spring Boot 4.1.2
* Thymeleaf (Motor de plantillas HTML)
* Maven (Gestor de dependencias)

## ✨ Características implementadas
* **DTO (Data Transfer Object):** Clase `ProductoDTO` para estructurar los datos de los productos.
* **Controlador MVC:** `ProductoController` encargado de devolver vistas HTML.
* **Objeto Model y `th:each`:** Uso del objeto `Model` para enviar una lista de productos a la vista y renderizarla dinámicamente con la directiva `th:each`.
* **Formulario y `@ModelAttribute`:** Vista con formulario para capturar datos de un producto y procesarlo en el servidor.
* **`@RequestParam`:** Endpoint para filtrar la lista de productos por categoría.
* **`@PathVariable`:** Endpoint para ver el detalle de un producto por su ID.
* **`@Value`:** Lectura de una propiedad personalizada (`mi.proyecto.autor`) desde `application.properties` y mostrada en la vista.
* **Endpoint POST REST:** Endpoint que recibe un JSON (`@RequestBody`) y responde con JSON.

---

## 📸 Evidencia de Funcionamiento

### 1. Vista de la lista de productos (`th:each` y `@Value`)
*Muestra la tabla generada recorriendo la lista, y el autor leído desde el archivo properties.*
<img width="1110" height="392" alt="image" src="https://github.com/user-attachments/assets/0ef0474d-a360-434b-96d7-ecfb47ed2bf3" />

### 2. Formulario con `@ModelAttribute`
*Formulario para ingresar un nuevo producto.*
<img width="1057" height="296" alt="Captura de pantalla 2026-11-08 193229" src="https://github.com/user-attachments/assets/4088ba60-1bfc-4751-9940-6dbe2e1e0e76" />

### 3. Filtro con `@RequestParam`
*Resultado del endpoint `/productos/filtrar?categoria=Electronica`.*
<img width="805" height="297" alt="image" src="https://github.com/user-attachments/assets/7f08ed7a-f46f-4227-8865-05a30f59c9cd" />


### 4. Detalle con `@PathVariable`
*Resultado del endpoint `/productos/1`.*
<img width="750" height="292" alt="image" src="https://github.com/user-attachments/assets/ac289196-8052-452b-9e40-51215cbda0e1" />


### 5. Petición POST (Postman)
*Prueba del endpoint `/api/productos` enviando un JSON y recibiendo la respuesta.*
<img width="908" height="665" alt="image" src="https://github.com/user-attachments/assets/ccab2f91-ec8b-40db-aeac-45b204f3bb69" />


---

## 🚀 Cómo ejecutar el proyecto en local
1. Clona el repositorio.
2. Abre el proyecto en tu IDE preferido.
3. Ejecuta la clase principal `VmzAct1T4Application`.
4. Abre tu navegador en `http://localhost:8082/productos`.

## 🌐 Despliegue en el VPS
El proyecto se encuentra desplegado y funcionando en el VPS de AWS, en un puerto distinto al de la Actividad 1 para evitar conflictos:
* **URL del proyecto en el VPS:** `http://77.113.100.81:8083/productos`
