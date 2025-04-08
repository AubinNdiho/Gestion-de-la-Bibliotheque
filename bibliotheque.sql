-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 08 avr. 2025 à 12:16
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
-- Base de données : `bibliotheque`
--

-- --------------------------------------------------------

--
-- Structure de la table `bibliothecaire`
--

DROP TABLE IF EXISTS `bibliothecaire`;
CREATE TABLE IF NOT EXISTS `bibliothecaire` (
  `idB` int NOT NULL DEFAULT '0',
  `nomB` varchar(30) NOT NULL,
  `prenomB` varchar(30) NOT NULL,
  `adresseB` varchar(30) NOT NULL,
  `telB` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `bibliothecaire`
--

INSERT INTO `bibliothecaire` (`idB`, `nomB`, `prenomB`, `adresseB`, `telB`) VALUES
(100, 'kiriho', 'jimmy', 'kamenge', '62225566'),
(101, 'kariho', 'jiva', 'kamenge', '61225566'),
(102, 'kigeme', 'jivanette', 'kamenge', '61225569'),
(103, 'Gakumi', 'jivanese', 'kamenge', '61225565'),
(104, 'Gikumu', 'jineve', 'kamenge', '61228565');

-- --------------------------------------------------------

--
-- Structure de la table `empunt`
--

DROP TABLE IF EXISTS `empunt`;
CREATE TABLE IF NOT EXISTS `empunt` (
  `idEmp` int NOT NULL DEFAULT '0',
  `idE` int NOT NULL,
  `dateEmp` date NOT NULL,
  `dateremise` date NOT NULL,
  `livre` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `empunt`
--

INSERT INTO `empunt` (`idEmp`, `idE`, `dateEmp`, `dateremise`, `livre`) VALUES
(300, 200, '2025-04-07', '2025-04-10', 'roman'),
(301, 201, '2025-04-07', '2025-04-10', 'roman1'),
(302, 202, '2025-04-07', '2025-04-10', 'roman2'),
(303, 203, '2025-04-07', '2025-04-10', 'roman3'),
(304, 204, '2025-04-07', '2025-04-10', 'roman4');

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

DROP TABLE IF EXISTS `etudiant`;
CREATE TABLE IF NOT EXISTS `etudiant` (
  `idE` int NOT NULL DEFAULT '0',
  `nomE` varchar(30) NOT NULL,
  `prenomE` varchar(30) NOT NULL,
  `adresseE` varchar(30) NOT NULL,
  `idB` int NOT NULL,
  `telE` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`idE`, `nomE`, `prenomE`, `adresseE`, `idB`, `telE`) VALUES
(200, 'jiji', 'huhu', 'fofo', 102, '69854712'),
(201, 'jii', 'hhu', 'fofo', 102, '68854712'),
(202, 'jip', 'hhu', 'fofo', 101, '68854752'),
(203, 'jip', 'hlu', 'fofo', 100, '68854052'),
(204, 'jp', 'hpu', 'fofo', 100, '68954052');

-- --------------------------------------------------------

--
-- Structure de la table `gerer`
--

DROP TABLE IF EXISTS `gerer`;
CREATE TABLE IF NOT EXISTS `gerer` (
  `idl` int NOT NULL,
  `idB` int NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `gerer`
--

INSERT INTO `gerer` (`idl`, `idB`) VALUES
(502, 100),
(501, 103),
(503, 101),
(504, 104),
(500, 102);

-- --------------------------------------------------------

--
-- Structure de la table `lire`
--

DROP TABLE IF EXISTS `lire`;
CREATE TABLE IF NOT EXISTS `lire` (
  `idE` int NOT NULL,
  `idl` int NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `lire`
--

INSERT INTO `lire` (`idE`, `idl`) VALUES
(200, 500),
(202, 501),
(203, 504),
(201, 502),
(204, 503);

-- --------------------------------------------------------

--
-- Structure de la table `livre`
--

DROP TABLE IF EXISTS `livre`;
CREATE TABLE IF NOT EXISTS `livre` (
  `idl` int NOT NULL DEFAULT '0',
  `noml` varchar(30) NOT NULL,
  `auteur` varchar(30) NOT NULL,
  `idEmp` int NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `livre`
--

INSERT INTO `livre` (`idl`, `noml`, `auteur`, `idEmp`) VALUES
(500, 'roman2', 'kijiko', 302),
(501, 'roman1', 'kijio', 303),
(502, 'roman4', 'kij', 301),
(503, 'roman3', 'ki', 303),
(504, 'roman', 'kihiu', 300);

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `idRes` int NOT NULL DEFAULT '0',
  `livre` varchar(30) NOT NULL,
  `dateRes` date NOT NULL,
  `idE` int NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `reservation`
--

INSERT INTO `reservation` (`idRes`, `livre`, `dateRes`, `idE`) VALUES
(600, 'roman2', '2025-04-05', 200),
(601, 'roman2', '2025-04-06', 203),
(602, 'roman', '2025-03-02', 203),
(603, 'roman3', '2025-03-06', 204),
(604, 'roman1', '2025-04-07', 201);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
