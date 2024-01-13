-- phpMyAdmin SQL Dump
-- version 3.2.0.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 12, 2019 at 07:31 AM
-- Server version: 5.1.36
-- PHP Version: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `naukari`
--
CREATE DATABASE `naukari` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `naukari`;

-- --------------------------------------------------------

--
-- Table structure for table `tblapply`
--

CREATE TABLE IF NOT EXISTS `tblapply` (
  `aid` int(5) NOT NULL AUTO_INCREMENT,
  `jid` varchar(200) NOT NULL,
  `uid` varchar(200) NOT NULL,
  `jdate` varchar(200) NOT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `tblapply`
--

INSERT INTO `tblapply` (`aid`, `jid`, `uid`, `jdate`) VALUES
(1, '51', 'om@gmail.com', '2019-08-11'),
(2, '51', 'om@gmail.com', '2019-08-11'),
(3, '51', 'om@gmail.com', '2019-08-11'),
(4, '51', 'om@gmail.com', '2019-08-11'),
(5, '51', 'om@gmail.com', '2019-08-11'),
(6, '47', 'om@gmail.com', '2019-08-11'),
(7, '48', 'om@gmail.com', '2019-08-11'),
(8, '51', 'om@gmail.com', '2019-08-11');

-- --------------------------------------------------------

--
-- Table structure for table `tblcategory`
--

CREATE TABLE IF NOT EXISTS `tblcategory` (
  `cid` int(5) NOT NULL AUTO_INCREMENT,
  `cname` varchar(200) NOT NULL,
  `cdate` varchar(50) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=20 ;

--
-- Dumping data for table `tblcategory`
--

INSERT INTO `tblcategory` (`cid`, `cname`, `cdate`) VALUES
(11, 'dfgdf', '2019-08-06'),
(13, 'techpile', '2019-08-06'),
(4, 'ayushi', '2019-08-04'),
(16, 'hr', '2019-08-07'),
(15, 'hr', '2019-08-07'),
(17, 'TECHPILE TECHNOLOGY PVT LTD', '2019-08-11'),
(18, 'techpile', '2019-08-11'),
(19, 'ersfdx', '2019-08-11');

-- --------------------------------------------------------

--
-- Table structure for table `tblchange`
--

CREATE TABLE IF NOT EXISTS `tblchange` (
  `email` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblchange`
--

INSERT INTO `tblchange` (`email`, `pass`) VALUES
('nitu@gmail.com', '22');

-- --------------------------------------------------------

--
-- Table structure for table `tblcontact`
--

CREATE TABLE IF NOT EXISTS `tblcontact` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `msg` text NOT NULL,
  `cdate` varchar(50) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `tblcontact`
--

INSERT INTO `tblcontact` (`cid`, `name`, `email`, `mobile`, `msg`, `cdate`) VALUES
(14, 'Ayushi', 'gdhgd@hkjg.jgi', '476528', 'hgvljhzbv', '2019-08-07'),
(15, 'ayushi kesharwani', 'ayushi@dfg.com', '3454656', 'GVJHBJ', '2019-08-08'),
(13, 'Ayushi', 'keshar@wani.com', '098767', 'qwerycgkfk gk  gygjh fy yfuy fl', '2019-08-02'),
(9, 'Ayushi', 'gdhgd@hkjg.jgi', '2345678', ' rdtftyfdjgsjdh', '2019-08-02'),
(16, 'ayushi kesharwani', 'keshar@wani.com', '679787', 'FCGVHB', '2019-08-08');

-- --------------------------------------------------------

--
-- Table structure for table `tbljobs`
--

CREATE TABLE IF NOT EXISTS `tbljobs` (
  `jid` int(5) NOT NULL AUTO_INCREMENT,
  `catname` varchar(200) NOT NULL,
  `jtitle` varchar(200) NOT NULL,
  `cname` varchar(100) NOT NULL,
  `clogo` varchar(200) NOT NULL,
  `city` varchar(100) NOT NULL,
  `salary` int(5) NOT NULL,
  `experience` varchar(200) NOT NULL,
  `description` text NOT NULL,
  `hrcontact` varchar(20) NOT NULL,
  `duration` varchar(100) NOT NULL,
  `vacancis` int(6) NOT NULL,
  `jdate` varchar(50) NOT NULL,
  PRIMARY KEY (`jid`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=52 ;

--
-- Dumping data for table `tbljobs`
--

INSERT INTO `tbljobs` (`jid`, `catname`, `jtitle`, `cname`, `clogo`, `city`, `salary`, `experience`, `description`, `hrcontact`, `duration`, `vacancis`, `jdate`) VALUES
(50, 'High Profession', 'SOFTWARE DEVELOPER', 'WIPRO', 'n13.png', 'DELHI', 2000, '1-YEAR', 'Full Time', '3455653', '10-8pm', 23, '2019-08-11'),
(49, 'High Profession', 'SOFTWARE DEVELOPER', 'TECHPILE TECHNOLOGY PVT LTD', 'logo8.jpg', 'LUCKNOW', 20000, '1-YEAR', 'full time', '1', '8-5pm', 12, '2019-08-11'),
(48, 'High Profession', 'SOFTWARE DEVELOPER', 'TECHPILE TECHNOLOGY PVT LTD', 'logo8.jpg', 'LUCKNOW', 20000, '1-YEAR', 'full time', '548354658136', '8-5pm', 12, '2019-08-11'),
(46, 'LOW PROFESSION', 'SOFTWARE DEVELOPER', 'TECHPILE TECHNOLOGY PVT LTD', 'n27.jpg', 'DELHI', 15000, '1-YEAR', 'FULL TIME', '62814536', '8-5PM', 25, '2019-08-07');

-- --------------------------------------------------------

--
-- Table structure for table `tbllogin`
--

CREATE TABLE IF NOT EXISTS `tbllogin` (
  `email` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbllogin`
--

INSERT INTO `tbllogin` (`email`, `pass`) VALUES
('ayushi@kesh.com', '123');

-- --------------------------------------------------------

--
-- Table structure for table `tblregister`
--

CREATE TABLE IF NOT EXISTS `tblregister` (
  `name` varchar(200) NOT NULL,
  `email` varchar(300) NOT NULL,
  `mobno` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `jcategory` varchar(100) NOT NULL,
  `qualification` varchar(100) NOT NULL,
  `experience` varchar(200) NOT NULL,
  `address` varchar(300) NOT NULL,
  `pic` varchar(200) NOT NULL,
  `regdate` varchar(50) NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblregister`
--

INSERT INTO `tblregister` (`name`, `email`, `mobno`, `password`, `gender`, `jcategory`, `qualification`, `experience`, `address`, `pic`, `regdate`) VALUES
('riya', 'keshar@wani.com', '1234567', 'cd tfj', 'Female', 'Diploma', 'Diploma', 'gfkahjf', ' xresyvtlulv', '', '2019-08-04'),
('riya', 'kesh@wani.com', '1234567', 'cd tfj', 'Female', 'Diploma', 'Diploma', 'gfkahjf', ' xresyvtlulv', '', '2019-08-04'),
('om', 'om@gmail.com', '85349187', '11', 'Female', 'developer', 'B.Tech', '5', ' sbvd,hjsvdjc', 'n8.jpg', '2019-08-07'),
('Ayushi', 'gdhgd@hkjg.jgi', '342647', '63274', 'Female', 'developer', 'B.Tech', 'hdbjh', ' hgdjhdf', 'logo10.jpg', '2019-08-06'),
('Ayushi', 'ayushi@kesh.com', '7649738', '4389574', 'Female', 'developer', 'B.Tech', '5', ' dhjbf,ahj', 'logo8.jpg', '2019-08-07'),
('Ayushi', 'q@kesh.com', '7649738', '', 'Female', 'developer', 'B.Tech', '5', ' dhjbf,ahj', 'logo8.jpg', '2019-08-07'),
('', '', '', '', '--Select Gender--', '--Select qualification--', '--Select qualification--', '', ' ', '', '2019-08-07'),
('neha', 'neha@gmail.com', '8429623603', '11', 'Female', 'software developer', 'B.Tech', '1-year', ' Allahabad', 'n92.jpg', '2019-08-07'),
('neha', 'nitu@gmail.com', '8429623603', '120', 'Female', 'developer', 'Diploma', '2-year', ' Allahabad', 'n111.png', '2019-08-07'),
('Ayushi', 'FSD@GMAIL.COM', '3817', '352', 'Female', 'software developer', 'BCA', '1 ', ' GFSJGHVH', 'n11.png', '2019-08-07'),
('ayushi kesharwani', 'AA@GMAIL.COM', '63527469', '12', 'Female', 'developer', 'B.Tech', '1-year', ' TFJYTFH', 'logo9.jpg', '2019-08-07'),
('Ayushi', 'PP@GMAIL.COM', '56875', '45', 'Female', 'software developer', 'B.Tech', '1-year', ' ALLAHABAD', 'logo9.jpg', '2019-08-07'),
('Ayushi', 'L@GMAIL.COM', '786438', '74', 'Female', 'software developer', 'B.Tech', '1-year', ' BVDCJASDYG', 'logo6.jpg', '2019-08-07'),
('Ayushi', 'amisha@gmail.com', '37647123', '12', 'Female', 'developer', 'Diploma', '1-year', ' HSGDKCHSDVJH', 'logo6.jpg', '2019-08-07'),
('Ayushi', 'k@gmail.com', '65347123', '56', 'Female', 'developer', 'Diploma', '', ' rerua', 'n108.png', '2019-08-07'),
('Ayushi', 'O@GMAIL.COM', '653148', '12', 'Female', 'developer', 'Diploma', '1-year', ' sghDK', 'n1.png', '2019-08-07'),
('Ayushi', 'A@GMAIL.COM', '673149', '34', 'Female', 'developer', 'Diploma', '1-year', ' HDcjNZ', 'logo6.jpg', '2019-08-07'),
('ayushi kesharwani', 'w@gmail.com', '62527365', '23', 'Female', 'software developer', 'BCA', '1-year', ' vaDKADSG', 'logo6.jpg', '2019-08-07'),
('Ayushi', 'E@GMAIL.COM', '736587', '3768', 'Female', 'developer', 'MCA', '1-year', ' DVFKAHG', 'logo8.jpg', '2019-08-07'),
('Ayushi', 'F@GMAIL.COM', '347689', '23', 'Female', 'developer', 'B.Tech', '1-year', ' EFDFG', 'n1.png', '2019-08-07'),
('ayushi kesharwani', 'U@GMAIL.COM', '', '', '--Select Gender--', '--Select qualification--', '--Select qualification--', '', ' ', '', '2019-08-07'),
('Ayushi', 'AYUSH@GMAIL.COM', '', '', '--Select Gender--', '--Select qualification--', '--Select qualification--', '', ' ', '', '2019-08-07'),
('Ayushi', 'AU@GMAIL.COM', '', '', '--Select Gender--', '--Select qualification--', '--Select qualification--', '', ' ', '', '2019-08-08'),
('ayushi kesharwani', 'GYAN@GMAIL.COM', '', '', '--Select Gender--', '--Select qualification--', '--Select qualification--', '', ' ', '', '2019-08-08'),
('ayushi kesharwani', 'H@GMAIL.COM', '767495278', '12', 'Female', 'software developer', 'B.Tech', '1-year', ' JV:kj:vKJHV', 'n1.png', '2019-08-08');

-- --------------------------------------------------------

--
-- Table structure for table `testreg`
--

CREATE TABLE IF NOT EXISTS `testreg` (
  `sn` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `dob` varchar(100) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `mobno` varchar(15) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `qualification` varchar(50) DEFAULT NULL,
  `pic` varchar(200) DEFAULT NULL,
  `regdate` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sn`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

--
-- Dumping data for table `testreg`
--

INSERT INTO `testreg` (`sn`, `name`, `dob`, `email`, `mobno`, `gender`, `qualification`, `pic`, `regdate`) VALUES
(9, 'sdfghj', '2019-07-31', 'EFOBB@HDGSFL.COM', '28734567', 'female', 'Diploma', 'n2.jpg', '2019-07-31'),
(11, 'GFGB AUF', '2019-08-07', 'gdhgd@hkjg.jgi', '', 'Female', 'BCA', 'logo11.jpg', '2019-08-02'),
(23, 'ayushi kesharwani', '2019-08-12', 'keshar@wani.com', '1234567', 'Female', 'MCA', '', '2019-08-03'),
(13, 'Ayushi', '2019-08-16', 'gdhgd@hkjg.jgi', '54657', 'Female', 'Diploma', 'n1.png', '2019-08-02'),
(21, 'Ayushi', '2019-08-23', 'ayushi@kesh.com', '1234567', 'Female', 'Diploma', 'logo10.jpg', '2019-08-03'),
(16, 'Ayushi', '2019-08-14', 'EFOBB@HDGSFL.COM', '234567', 'Female', 'Diploma', 'n1.png', '2019-08-02'),
(22, 'nitu', '2019-08-13', 'ayushi@kesh.com', '212345678', 'Female', 'B.Tech', 'logo10.jpg', '2019-08-03'),
(20, 'Ayushi', '1234567', 'gdhgd@hkjg.jgi', '1234567', 'Female', 'Diploma', 'logo11.jpg', '2019-08-03');
