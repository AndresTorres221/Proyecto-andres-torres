# Alcance

El alcance del sistema contempla la integración de diferentes módulos que aseguren la trazabilidad de la información. Para ello, la entidad de donantes contendrá los datos esenciales de supermercados, restaurantes, panaderías, agricultores y personas particulares que aporten alimentos, incluyendo nombre, tipo de donante, ubicación y contacto. De igual manera, la entidad de beneficiarios registrará a las fundaciones, comedores comunitarios y familias en condición de vulnerabilidad, con información relacionada al estrato socioeconómico, ubicación y el tipo de ayuda solicitada. 
Por otra parte, la entidad de productos permitirá almacenar los alimentos donados, clasificándolos en categorías como frutas, verduras, pan, lácteos, entre otros, además de incluir detalles como la cantidad disponible, la fecha de vencimiento y el estado de conservación (Kuuse, 2023). A esta se suma la entidad de donaciones, que relacionará cada producto con el donante correspondiente y las fechas de entrega, asegurando un seguimiento transparente de cada aporte. Finalmente, la entidad de entregas se enfocará en controlar la distribución de los alimentos hacia los beneficiarios, registrando rutas, fechas y responsables de las entregas, lo que permitirá tener un control más eficiente de la logística (COSMO CONSULT, 2024). 

## ¿Qué va a integrar? 

Adicionalmente, se integrará un módulo de inteligencia artificial que analizará los datos de las donaciones para identificar patrones, tales como los productos más donados o aquellos que suelen desperdiciarse con mayor frecuencia. Esta herramienta permitirá anticipar necesidades, optimizar el proceso de distribución y fortalecer la planeación futura de las campañas de recolección (Pulpos, 2024). 

## ¿Qué no va a incluir? 

Por otro lado, es importante aclarar qué no incluirá este proyecto. No se gestionarán ayudas económicas ni subsidios monetarios, ya que el enfoque se limita exclusivamente a la recolección, organización y entrega de alimentos. Tampoco se contemplará el cubrimiento de gastos logísticos externos, como transporte privado, bodegaje independiente de aliados o pagos de personal no voluntario. 

Las restricciones estarán orientadas a garantizar que los recursos lleguen a quienes realmente lo necesitan. Por ejemplo, las personas pertenecientes a estratos socioeconómicos 4, 5 y 6 no serán beneficiarias de las donaciones, ya que el sistema estará enfocado en apoyar a familias en condiciones de vulnerabilidad y pobreza. Asimismo, los donantes deberán cumplir con la normativa vigente sobre manipulación de alimentos, evitando la entrega de productos vencidos o en mal estado. 
 
## ¿Cómo se va a realizar? 

El Banco de Alimentos Inteligente para Medellín parte del concepto de banco de alimentos, entendido como una organización que recolecta alimentos donados por supermercados, restaurantes, productores o particulares y los redistribuye a poblaciones vulnerables. Su misión es reducir el hambre y el desperdicio de comida, generando un puente entre la abundancia y la necesidad (Fundación Banco de Alimentos de Medellín, n.d.). Sin embargo, estas iniciativas suelen carecer de herramientas tecnológicas que aseguren eficiencia en la gestión de inventarios y trazabilidad, lo que limita su impacto social. 
Gestión de inventarios y trazabilidad 
La gestión de inventarios es fundamental para garantizar que los alimentos lleguen a tiempo, en buen estado y con un control de fechas de vencimiento. Según The Food Tech (2024), una adecuada gestión en la industria alimentaria optimiza recursos, minimiza pérdidas y asegura disponibilidad. En este proyecto, el sistema implementará un módulo de inventarios digitalizado capaz de: 
•	Registrar entradas y salidas de productos. 
•	Monitorear condiciones de almacenamiento. 
•	Prever el agotamiento de alimentos. 
La trazabilidad de alimentos es otro pilar teórico. Hernández (2024) afirma que la automatización de este proceso incrementa la confiabilidad de los bancos de alimentos al garantizar transparencia tanto para donantes como para beneficiarios. En este sentido, el proyecto incluirá una base de datos relacional que permitirá rastrear cada alimento desde el donante hasta el beneficiario final. 
Diseño de la base de datos 
El diseño se basará en modelos relacionales con tablas interconectadas: 
•	Donantes (supermercados, restaurantes, agricultores, particulares). 
•	Productos (categoría, fecha de vencimiento, estado de conservación, cantidad). 
•	Beneficiarios (fundaciones, comedores, familias). 
•	Donaciones (registro de aportes vinculados a donantes y productos). 
•	Entregas (destino, rutas, responsables, fechas). 
La elección de un Sistema de Gestión de Bases de Datos (SGBD) como PostgreSQL o MySQL permitirá consultas rápidas, integridad referencial y escalabilidad. 
Algoritmos y estructuras de datos 
El núcleo del sistema estará soportado en la algoritmia aplicada a la logística y clasificación de datos. Entre los algoritmos clave se incluyen: 
1.	Algoritmos de clasificación y ordenamiento 
o	MergeSort, QuickSort para organizar alimentos por fecha de vencimiento o prioridad. 
o	HeapSort para priorizar donaciones urgentes. 
2.	Algoritmos de búsqueda 
o	Búsqueda binaria para localizar rápidamente productos en inventario. 
o	Hashing para búsquedas rápidas en tablas de donantes y beneficiarios. 
3.	Estructuras de datos 
o	Vectores: para almacenar lotes de productos disponibles. 
o	Listas enlazadas: para administrar dinámicamente las donaciones entrantes y salientes. 
o	Colas: para gestionar las solicitudes de beneficiarios en orden de llegada. 
o	Árboles binarios y AVL: para jerarquizar productos según prioridad (ejemplo: cercanía a fecha de vencimiento). 
o	Grafos: para representar rutas logísticas de entrega (nodos = puntos de distribución, aristas = caminos). 
4.	Algoritmos de optimización logística 
o	Dijkstra o A para calcular rutas de entrega más cortas. 
Lenguajes de programación y paradigmas 
La implementación del sistema se apoyará en lenguajes de programación modernos y versátiles: 
•	Java: robustez, orientación a objetos, y soporte para algoritmos complejos. SQL gestión de consultas y operaciones sobre bases de datos relacionales. 
•	HTML5, CSS3 y React: diseño de interfaces intuitivas y responsivas. 
El paradigma principal será la programación orientada a objetos (POO) para encapsular entidades como Donantes, Productos y Entregas, complementado con programación estructurada para algoritmos específicos de clasificación y optimización. 
Inteligencia Artificial y predicción de demanda 
La IA aplicada a la cadena de suministro constituye un elemento innovador. Según Rootstack (2024), la predicción de demanda mediante modelos de aprendizaje automático reduce el desabastecimiento. En este proyecto se usará un módulo predictivo que: 
•	Analizará datos históricos de donaciones. 
•	Identificará patrones de productos más donados o más desperdiciados. 
•	Estimará la probabilidad de escasez de ciertos alimentos. 
Se considerarán modelos como: 
•	Regresión lineal múltiple para prever cantidades donadas en función de variables (temporada, eventos, tipo de donante). 

