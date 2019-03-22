-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 22, 2019 at 11:45 AM
-- Server version: 5.7.25-0ubuntu0.18.04.2
-- PHP Version: 7.2.15-0ubuntu0.18.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_bikestore`
--

-- --------------------------------------------------------

--
-- Table structure for table `Bikes`
--

CREATE TABLE `Bikes` (
  `BikeId` int(11) DEFAULT NULL,
  `BikeBrand` int(11) DEFAULT NULL,
  `BikeType` int(11) DEFAULT NULL,
  `RimSize` double DEFAULT NULL,
  `NumberOfGears` varchar(255) DEFAULT NULL,
  `DateLastTask` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Bike_Type_City`
--

CREATE TABLE `Bike_Type_City` (
  `BikeId` int(11) DEFAULT NULL,
  `Power` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Bike_Type_Electric`
--

CREATE TABLE `Bike_Type_Electric` (
  `BikeId` int(11) DEFAULT NULL,
  `BikeBag` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Bike_Type_Mountain`
--

CREATE TABLE `Bike_Type_Mountain` (
  `BikeId` int(11) DEFAULT NULL,
  `Suspension` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Customers`
--

CREATE TABLE `Customers` (
  `CustomerId` int(11) NOT NULL,
  `FirsttName` varchar(255) DEFAULT NULL,
  `LastName` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Tasks`
--

CREATE TABLE `Tasks` (
  `TaskId` int(11) NOT NULL,
  `CustomerId` int(11) DEFAULT NULL,
  `BikeId` int(11) DEFAULT NULL,
  `Indication` varchar(255) DEFAULT NULL,
  `TaskDate` int(11) DEFAULT NULL,
  `TaskReadyDate` int(11) DEFAULT NULL,
  `Description` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Bikes`
--
ALTER TABLE `Bikes`
  ADD KEY `BikeId` (`BikeId`,`BikeBrand`,`BikeType`,`RimSize`,`NumberOfGears`,`DateLastTask`);

--
-- Indexes for table `Bike_Type_City`
--
ALTER TABLE `Bike_Type_City`
  ADD KEY `BikeId` (`BikeId`,`Power`);

--
-- Indexes for table `Bike_Type_Electric`
--
ALTER TABLE `Bike_Type_Electric`
  ADD KEY `BikeId` (`BikeId`,`BikeBag`);

--
-- Indexes for table `Bike_Type_Mountain`
--
ALTER TABLE `Bike_Type_Mountain`
  ADD KEY `BikeId` (`BikeId`,`Suspension`);

--
-- Indexes for table `Customers`
--
ALTER TABLE `Customers`
  ADD PRIMARY KEY (`CustomerId`),
  ADD UNIQUE KEY `CustomerId` (`CustomerId`),
  ADD KEY `CustomerId_2` (`CustomerId`,`FirsttName`,`LastName`,`Email`),
  ADD KEY `CustomerId_3` (`CustomerId`,`FirsttName`,`LastName`,`Email`);

--
-- Indexes for table `Tasks`
--
ALTER TABLE `Tasks`
  ADD PRIMARY KEY (`TaskId`),
  ADD KEY `TaskId` (`TaskId`,`CustomerId`,`BikeId`,`Indication`,`TaskDate`,`TaskReadyDate`),
  ADD KEY `BikeId` (`BikeId`),
  ADD KEY `CustomerId` (`CustomerId`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Tasks`
--
ALTER TABLE `Tasks`
  ADD CONSTRAINT `Tasks_ibfk_1` FOREIGN KEY (`BikeId`) REFERENCES `Bikes` (`BikeId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `Tasks_ibfk_2` FOREIGN KEY (`CustomerId`) REFERENCES `Customers` (`CustomerId`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;