-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 07, 2025 at 10:09 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `e-library`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `B_ID` int(20) NOT NULL,
  `B_Name` varchar(50) NOT NULL,
  `ISBN` varchar(30) NOT NULL,
  `Auth` varchar(50) NOT NULL,
  `price` decimal(8,0) NOT NULL,
  `distributors` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`B_ID`, `B_Name`, `ISBN`, `Auth`, `price`, `distributors`) VALUES
(1, 'Madol Duwa', '978-0-306-40615-7', 'Martien Wickramasingha', 500, 'sarasavi'),
(72, 'Froget Me Not', '978-624-5546-73-2', 'Chathuri Damayanthi', 1200, 'epex Print'),
(231, 'Sherlock Holmes', '0-9767736-6-X', 'Conan Doyle', 700, 'Gunasena Pvt Ltd'),
(543, 'Aeya', '654-435-5522-54-8', 'Chandani Chandralatha', 800, 'Ex printers');

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `m_ID` int(11) NOT NULL,
  `F_Name` varchar(50) NOT NULL,
  `L_Name` varchar(50) NOT NULL,
  `M_No` int(11) NOT NULL,
  `address` varchar(100) NOT NULL,
  `age` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`m_ID`, `F_Name`, `L_Name`, `M_No`, `address`, `age`) VALUES
(1, 'kumudu', 'shakila', 765566781, 'gampala', 56),
(2, 'samadhi', 'kularathne', 743255678, 'Polonnaruwa', 24),
(3, 'Tharaka', 'Rathnayake', 777342345, 'Bandarawela', 22),
(4, 'malith', 'rajamanthri', 757565743, 'Ampitiya', 12),
(5, 'Lakshan', 'Ariyarathne', 770539741, 'Pallekale', 23);

-- --------------------------------------------------------

--
-- Table structure for table `student_log`
--

CREATE TABLE `student_log` (
  `fName` varchar(50) NOT NULL,
  `lName` varchar(50) NOT NULL,
  `Adress` varchar(200) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `NIC` varchar(20) NOT NULL,
  `Pass` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_log`
--

INSERT INTO `student_log` (`fName`, `lName`, `Adress`, `Email`, `NIC`, `Pass`) VALUES
('John', 'De Silva', 'Katugasthota', 'john@email.com', '123', '123'),
('Nimal', 'Siripala', 'Galle', 'nimalsiri@gmail.com', '199873500354', 'nimalsiri'),
('sunil', 'perera', 'kandy', 'sunilp@emial.com', '200087645362', 'Sperera'),
('Chamod', 'Bandara', 'Kegalle', 'chamodbandara@gmail.com', '200385799432', 'chamod434'),
('Chamodi', 'Senevirathne', 'peradeniya', 'chamodibandara2000@gmail.com', '2000045600321', 'chamodi123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`B_ID`);

--
-- Indexes for table `members`
--
ALTER TABLE `members`
  ADD PRIMARY KEY (`m_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `B_ID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=544;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
