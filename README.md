<div align="center">
<img width="2816" height="1536" alt="Gemini_Generated_Image_ca4gdgca4gdgca4g" src="https://github.com/user-attachments/assets/fb28de93-5d76-48ea-ba72-9704de9af547" />
</div>  

  
<div align="center">
  <p>
    # 🌍 Conversor de Monedas - Challenge Alura
  </p>
  
  ![Badge status](https://img.shields.io/badge/STATUS-FINALIZADO-blue)
  ![GitHub License](https://img.shields.io/github/license/Kavorlaya/amigo-secreto)
  ![GitHub Forks](https://img.shields.io/github/forks/Kavorlaya/amigo-secreto)
  ![GitHub Stars](https://img.shields.io/github/stars/Kavorlaya/amigo-secreto)
</div>


# 🌍 Conversor de Monedas - Challenge Alura

### Índice
* [Descripción](#descripción)
* [Funcionamiento](#funcionamiento)
* [Configuración de la API Key](#configuración-de-la-api-key)
* [Tecnologías Utilizadas](#tecnologías-utilizadas)
* [Nota de Calidad (QA)](#nota-de-calidad-qa)
* [Autor](#autor)

---

### Descripción
Esta aplicación es un conversor de divisas dinámico desarrollado en **Java**. El sistema permite realizar conversiones precisas entre diferentes monedas internacionales (Dólares, Pesos Argentinos, Euros, Libras, etc.) utilizando datos en tiempo real para garantizar la exactitud de los cálculos.

### Funcionamiento
El programa opera a través de una interfaz de consola bajo el siguiente flujo:
1. **Selección:** El usuario elige el par de divisas desde un menú interactivo.
2. **Ingreso:** Se solicita el monto que se desea convertir.
3. **Conexión:** El sistema consulta la tasa de cambio actual mediante una petición a **ExchangeRate-API**.
4. **Cálculo:** Se procesa la información y se muestra el resultado final convertido de forma inmediata.

---

### Configuración de la API Key
> ⚠️ **IMPORTANTE:** Por razones de seguridad y siguiendo buenas prácticas de desarrollo, este repositorio **no incluye mi clave personal** de acceso a la API.

Para ejecutar este proyecto, por favor siga estos pasos:
1. Obtenga una clave gratuita en [Exchangerate-API](https://www.exchangerate-api.com/).
2. Localice la clase `ConsultaMoneda` en el paquete fuente.
3. Reemplace el valor de la variable `API_KEY` con su propia clave:
   `private final String API_KEY = "ESCRIBA_AQUI_SU_API_KEY";`
4. Guarde los cambios y ejecute la aplicación desde su IDE (IntelliJ, Eclipse, etc.).

---

### Tecnologías Utilizadas
* **Java 17+**: Lenguaje principal de desarrollo.
* **Maven**: Gestión de dependencias y construcción del proyecto.
* **Gson (Google)**: Biblioteca para la deserialización y manejo de datos JSON.
* **HttpClient**: Para la gestión de peticiones asíncronas a servicios externos.

---

### Nota de Calidad (QA)
Como analista QA, he priorizado la **robustez del software** mediante:
* **Programación Defensiva:** El sistema valida la presencia de la API Key antes de intentar la conexión.
* **Manejo de Excepciones:** Mensajes de error claros ante fallos de red o ingresos de datos inválidos.
* **Higiene de Código:** Separación de responsabilidades entre la lógica de conexión y la lógica de negocio.

---

### Autor
<div align="center">
  <a href="https://github.com/Kavorlaya">
    <img src="https://github.com/Kavorlaya.png" width="200" alt="Foto de perfil" />
    <br />
    <span style="font-size:22px;"><b>Diego Nicolás Persi</b></span>
  </a>
</div>
