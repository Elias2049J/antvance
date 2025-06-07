# Sistema Antvance

Sistema de gestión para el transporte público que permite administrar vehículos, inspecciones, rutas, viajes y transacciones utilizando arquitectura hexagonal.

## 🏗️ Arquitectura

El proyecto está estructurado siguiendo los principios de **Arquitectura Hexagonal** (Ports & Adapters) con los siguientes módulos:

```
antvance/
├── antvance-domain/          # Entidades de dominio y lógica de negocio
├── antvance-application/     # Casos de uso y puertos
└── antvance-infrastructure/  # Adaptadores y configuración
```

### Módulos

####  antvance-domain
Contiene las entidades del dominio:
- **Vehiculo**: Gestión de vehículos del transporte público
- **Chofer**: Información de conductores
- **Inspeccion**: Registros de inspecciones técnicas
- **Ruta**: Definición de rutas de transporte
- **Estacion**: Estaciones de las rutas
- **Viaje**: Registro de viajes realizados
- **Transaccion**: Transacciones del sistema de pago
- **Tarjeta**: Tarjetas de pago
- **TipoTarjeta**: Tipos de tarjetas (estudiante, adulto mayor, etc.)
- **Modulo**: Módulos de pago en estaciones

####  antvance-application
Define los casos de uso y puertos:
- **Models**: Lógica de aplicación para cada entidad
- **Ports**: Interfaces para entrada (inbound) y salida (outbound)
- **Context**: Orquestación del flujo de interacción
- **Use Cases**: Casos de uso específicos del negocio

####  antvance-infrastructure
Implementa los adaptadores:
- **Web Adapters**: APIs REST para cada entidad
- **Console Adapters**: Interfaz de consola con menús interactivos
- **Persistence Adapters**: Adaptadores para base de datos
- **Repositories**: Repositorios JPA
- **Configuration**: Configuración de CORS y Spring Boot

##  Tecnologías

- **Java 21**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **Lombok**
- **Jakarta Persistence API**

##  Requisitos Previos

- Java 21 o superior
- PostgreSQL 12 o superior
- Maven 3.6 o superior

## ⚙️ Configuración

### Base de Datos
1. Crear una base de datos PostgreSQL llamada `antvance_db`
2. Configurar las credenciales en `application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/antvance_db
    username: postgres
    password: 12345678
```

### Instalación
1. Clonar el repositorio
2. Navegar al directorio raíz del proyecto
3. Compilar el proyecto:
```bash
mvn clean compile
```
4. Ejecutar la aplicación:
```bash
mvn spring-boot:run -pl antvance-infrastructure
```

## 🖥️ Interfaces Disponibles

### API REST
El sistema expone APIs REST para todas las entidades principales:

#### Vehículos
- `POST /vehiculo/crear` - Crear vehículo
- `PUT /vehiculo/actualizar/{placa}` - Actualizar vehículo
- `DELETE /vehiculo/eliminar/{placa}` - Eliminar vehículo
- `GET /vehiculo/obtener/{placa}` - Obtener vehículo por placa
- `GET /vehiculo/listar` - Listar todos los vehículos

#### Inspecciones
- `POST /inspeccion/crear` - Crear inspección
- `PUT /inspeccion/actualizar/{id}` - Actualizar inspección
- `DELETE /inspeccion/eliminar/{id}` - Eliminar inspección
- `GET /inspeccion/obtener/{id}` - Obtener inspección por ID
- `GET /inspeccion/listar` - Listar todas las inspecciones

#### Rutas, Transacciones y Viajes
APIs similares disponibles para estas entidades.

### Interfaz de Consola
El sistema incluye menús interactivos de consola:

1. **Menú Principal**
    - Gestionar Inspecciones
    - Gestionar Rutas y Viajes
    - Gestionar Registros de Transacciones

2. **Gestión de Inspecciones**
    - Registrar Nueva Inspección
    - Historial de Inspecciones
    - Administrar Inspecciones
    - Listar Vehículos por Filtro

3. **Gestión de Rutas y Viajes**
    - Planificar Rutas
    - Historial de Rutas y Viajes
    - Ver Registro de Conductores

4. **Gestión de Transacciones**
    - Visualizar Reportes
    - Histórico

## 🔗 Relaciones del Modelo

- **Vehiculo** ↔ **Chofer**: Relación uno a uno
- **Vehiculo** → **Inspeccion**: Uno a muchos
- **Vehiculo** → **Ruta**: Muchos a uno
- **Chofer** → **Viaje**: Uno a muchos
- **Ruta** → **Estacion**: Uno a muchos
- **Estacion** → **Modulo**: Uno a muchos
- **Modulo** → **Transaccion**: Uno a muchos
- **Tarjeta** → **Transaccion**: Uno a muchos
- **Tarjeta** → **TipoTarjeta**: Uno a muchos

## 🏛️ Patrón de Arquitectura

El proyecto implementa **Arquitectura Hexagonal** con:

- **Domain**: Entidades puras sin dependencias externas
- **Application**: Casos de uso y definición de puertos
- **Infrastructure**: Implementación de adaptadores

### Puertos y Adaptadores

#### Puertos de Entrada (Inbound)
- `WebPort<T, ID>`: Para operaciones CRUD via REST
- `ConsoleStrategy`: Para interacción por consola

#### Puertos de Salida (Outbound)
- `InspeccionRepoPort`: Persistencia de inspecciones
- `VehiculoRepoPort`: Persistencia de vehículos
- `ConsoleRenderer`: Renderizado en consola

## 🔧 Estado del Desarrollo

### Implementado ✅
- Estructura de arquitectura hexagonal
- Entidades de dominio con JPA
- Adaptadores web para Vehículo e Inspección
- Interfaz de consola con menús interactivos
- Repositorios y adaptadores de persistencia
- Configuración de base de datos PostgreSQL

### En Desarrollo 🚧
- Implementación completa de casos de uso
- Lógica de negocio en los models
- Funcionalidades completas de las APIs REST
- Validaciones y manejo de errores

## 🤝 Contribución

1. Fork el proyecto
2. Crear una rama para tu feature (`git checkout -b feature/nueva-funcionalidad`)
3. Commit tus cambios (`git commit -am 'Agregar nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Crear un Pull Request

## 📄 Licencia

Aún no se ha configurado la licencia.

## 👥 Equipo de Desarrollo

Desarrollado como sistema de gestión para transporte público utilizando mejores prácticas de arquitectura de software.

---