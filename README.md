# Voiture Shop - Application Full Stack

##  Description
Application de gestion de voitures développée avec Spring Boot (Backend), React (Frontend), MariaDB (Base de données), avec monitoring via Prometheus et Grafana.

## Technologies
- **Backend**: Spring Boot 3.3.5 + Spring Data REST + JPA
- **Frontend**: React 18 + React Bootstrap
- **Base de données**: MariaDB 11.0
- **Monitoring**: Prometheus + Grafana
- **Conteneurisation**: Docker + Docker Compose

## Captures d'écran

### Interface de l'application - Liste des Voitures
![Liste des Voitures](Screenshot%202025-10-23%20at%2017.24.29.png)

### Dashboard Grafana - Monitoring Spring Boot
![Grafana Dashboard](Screenshot%202025-10-23%20at%2017.34.36.png)

## Lancement avec Docker

### Prérequis
- Docker Desktop installé et démarré
- Ports disponibles: 3000, 8080, 3306, 9090, 3001

### Démarrer l'application
```bash
docker-compose up -d --build
```

Cette commande lance automatiquement les 5 services :
- **MariaDB** (port 3306) - Base de données
- **Backend Spring Boot** (port 8080) - API REST
- **Frontend React** (port 3000) - Interface utilisateur
- **Prometheus** (port 9090) - Collecte de métriques
- **Grafana** (port 3001) - Dashboards de monitoring

### Arrêter l'application
```bash
docker-compose down
```

### Arrêter et supprimer les données
```bash
docker-compose down -v
```

## Accès aux services
- **Application**: http://localhost:3000
- **API Backend**: http://localhost:8080
- **Prometheus**: http://localhost:9090
- **Grafana**: http://localhost:3001 (admin/admin)
