-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mer. 14 mai 2025 à 18:53
-- Version du serveur : 8.3.0
-- Version de PHP : 8.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `bibliothèque`
--

-- --------------------------------------------------------

--
-- Structure de la table `bibliothecaire`
--

DROP TABLE IF EXISTS `bibliothecaire`;
CREATE TABLE IF NOT EXISTS `bibliothecaire` (
  `idB` int NOT NULL AUTO_INCREMENT,
  `nomB` varchar(30) NOT NULL,
  `prenomB` varchar(30) NOT NULL,
  `adresseB` varchar(30) NOT NULL,
  `telB` varchar(30) NOT NULL,
  `Mot_de_passe` varchar(30) NOT NULL,
  PRIMARY KEY (`idB`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `bibliothecaire`
--

INSERT INTO `bibliothecaire` (`idB`, `nomB`, `prenomB`, `adresseB`, `telB`, `Mot_de_passe`) VALUES
(8, 'mika', 'jean', 'kigobe', '66666666', '123'),
(9, 'isco', 'madrid', 'kkk', '52525252', '123'),
(16, 'isco', 'madrid', 'kkk', '52525252', '123'),
(19, 'isco2', 'madrid2', 'kkddd', '525252', '123'),
(22, 'isco3', 'madrid2', 'kkddd', '525252', '123');

-- --------------------------------------------------------

--
-- Structure de la table `emprunt`
--

DROP TABLE IF EXISTS `emprunt`;
CREATE TABLE IF NOT EXISTS `emprunt` (
  `idEmp` int NOT NULL AUTO_INCREMENT,
  `dateRem` varchar(30) NOT NULL,
  `idl` int NOT NULL,
  `dateEmp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `idE` int NOT NULL,
  PRIMARY KEY (`idEmp`),
  KEY `idE` (`idE`),
  KEY `idl` (`idl`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `emprunt`
--

INSERT INTO `emprunt` (`idEmp`, `dateRem`, `idl`, `dateEmp`, `idE`) VALUES
(21, '2020-9-11', 15, '2025-05-11 05:28:03', 3),
(22, '2020-8-7', 15, '2025-05-11 05:28:47', 6);

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

DROP TABLE IF EXISTS `etudiant`;
CREATE TABLE IF NOT EXISTS `etudiant` (
  `idE` int NOT NULL AUTO_INCREMENT,
  `nomE` varchar(30) NOT NULL,
  `prenomE` varchar(30) NOT NULL,
  `adresseE` varchar(30) NOT NULL,
  `telE` varchar(30) NOT NULL,
  PRIMARY KEY (`idE`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`idE`, `nomE`, `prenomE`, `adresseE`, `telE`) VALUES
(1, 'Mugisha', 'Jules', 'kamenge', '62798563'),
(2, 'Mizero', 'Fleury', 'musaga', '65987410'),
(3, 'Masabo', 'Arnaud', 'kinindo', '79854120'),
(6, 'Munezero', 'Jean', 'kinindo', '69854712'),
(7, 'karl', 'kelvin ', 'kajaga', '65987410'),
(15, 'Mizero', 'Fleury', 'musaga', '65987410');

-- --------------------------------------------------------

--
-- Structure de la table `gerer`
--

DROP TABLE IF EXISTS `gerer`;
CREATE TABLE IF NOT EXISTS `gerer` (
  `idl` int NOT NULL,
  `idB` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `lire`
--

DROP TABLE IF EXISTS `lire`;
CREATE TABLE IF NOT EXISTS `lire` (
  `idE` int NOT NULL,
  `idl` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `livre`
--

DROP TABLE IF EXISTS `livre`;
CREATE TABLE IF NOT EXISTS `livre` (
  `idl` int NOT NULL AUTO_INCREMENT,
  `noml` varchar(30) NOT NULL,
  `auteur` varchar(30) NOT NULL,
  `volume` int NOT NULL,
  `maison` varchar(20) NOT NULL,
  `Isbn` varchar(30) NOT NULL,
  PRIMARY KEY (`idl`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `livre`
--

INSERT INTO `livre` (`idl`, `noml`, `auteur`, `volume`, `maison`, `Isbn`) VALUES
(15, 'bio-chimie', 'charles', 5, 'paris12', '1230/isbn'),
(16, 'bio-chimies', 'charles', 5, 'paris12', '1230/isbn'),
(18, 'bio-chimies', 'charles', 6, 'paris12', '1230/isbn'),
(22, 'bio-chimie', 'charles', 2, 'paris12', '1230/isbn');

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `idRes` int NOT NULL AUTO_INCREMENT,
  `idl` int NOT NULL,
  `dateRes` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `idE` int NOT NULL,
  PRIMARY KEY (`idRes`),
  KEY `idE` (`idE`),
  KEY `idl` (`idl`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `reservation`
--

INSERT INTO `reservation` (`idRes`, `idl`, `dateRes`, `idE`) VALUES
(47, 15, '2025-05-11 13:49:54', 2),
(49, 18, '2025-05-11 14:12:08', 3),
(50, 16, '2025-05-12 12:48:11', 3);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `emprunt`
--
ALTER TABLE `emprunt`
  ADD CONSTRAINT `emprunt_ibfk_1` FOREIGN KEY (`idE`) REFERENCES `etudiant` (`idE`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `emprunt_ibfk_2` FOREIGN KEY (`idl`) REFERENCES `livre` (`idl`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `reservation_ibfk_1` FOREIGN KEY (`idE`) REFERENCES `etudiant` (`idE`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `reservation_ibfk_2` FOREIGN KEY (`idl`) REFERENCES `livre` (`idl`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
