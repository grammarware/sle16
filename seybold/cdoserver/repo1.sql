-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Erstellungszeit: 17. Apr 2015 um 06:44
-- Server Version: 5.5.41-0ubuntu0.14.04.1
-- PHP-Version: 5.5.9-1ubuntu4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Datenbank: `repo1`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `CDO_BRANCHES`
--

CREATE TABLE IF NOT EXISTS `CDO_BRANCHES` (
  `ID` int(11) NOT NULL,
  `NAME` longtext COLLATE utf8_bin,
  `BASE_ID` int(11) DEFAULT NULL,
  `BASE_TIME` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `CDO_COMMIT_INFOS`
--

CREATE TABLE IF NOT EXISTS `CDO_COMMIT_INFOS` (
  `COMMIT_TIME` bigint(20) NOT NULL,
  `PREVIOUS_TIME` bigint(20) DEFAULT NULL,
  `BRANCH_ID` int(11) DEFAULT NULL,
  `USER_ID` longtext COLLATE utf8_bin,
  `COMMIT_COMMENT` longtext COLLATE utf8_bin,
  PRIMARY KEY (`COMMIT_TIME`),
  KEY `I1429200820562_8` (`BRANCH_ID`),
  KEY `I1429200820562_9` (`USER_ID`(255))
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `CDO_COMMIT_INFOS`
--

INSERT INTO `CDO_COMMIT_INFOS` (`COMMIT_TIME`, `PREVIOUS_TIME`, `BRANCH_ID`, `USER_ID`, `COMMIT_COMMENT`) VALUES
(1429200824535, 1429200824535, 0, 'CDO_SYSTEM', '<initialize>'),
(1429200827636, 1429200824535, 0, 'CDO_SYSTEM', NULL),
(1429200848341, 1429200827636, 0, 'CDO_SYSTEM', NULL),
(1429200908443, 1429200848341, 0, 'Administrator', NULL),
(1429200908550, 1429200908443, 0, 'CDO_SYSTEM', NULL),
(1429200920884, 1429200908550, 0, 'Administrator', NULL),
(1429200957818, 1429200920884, 0, 'CDO_SYSTEM', NULL),
(1429200981177, 1429200957818, 0, 'Administrator', NULL),
(1429200981295, 1429200981177, 0, 'CDO_SYSTEM', NULL),
(1429200996297, 1429200981295, 0, 'Administrator', NULL),
(1429200996385, 1429200996297, 0, 'CDO_SYSTEM', NULL),
(1429201010048, 1429200996385, 0, 'Administrator', NULL),
(1429201029915, 1429201010048, 0, 'Administrator', NULL),
(1429201063729, 1429201029915, 0, 'CDO_SYSTEM', NULL),
(1429201102478, 1429201063729, 0, 'CDO_SYSTEM', NULL),
(1429201129437, 1429201102478, 0, 'CDO_SYSTEM', NULL),
(1429252732802, 1429201129437, 0, 'Administrator', NULL),
(1429252900453, 1429252732802, 0, 'Administrator', NULL),
(1429252934798, 1429252900453, 0, 'Administrator', NULL),
(1429252941612, 1429252934798, 0, 'Administrator', NULL);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `CDO_EXTERNAL_REFS`
--

CREATE TABLE IF NOT EXISTS `CDO_EXTERNAL_REFS` (
  `ID` bigint(20) NOT NULL,
  `URI` longtext COLLATE utf8_bin,
  `COMMITTIME` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `I1429200823009_12` (`URI`(255))
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `CDO_EXTERNAL_REFS`
--

INSERT INTO `CDO_EXTERNAL_REFS` (`ID`, `URI`, `COMMITTIME`) VALUES
(-112, 'http://www.eclipse.org/emf/CDO/Eresource/4.0.0#/', 1429200827636),
(-111, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//OrFilter', 1429200827636),
(-110, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//AndFilter', 1429200827636),
(-109, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//CombinedFilter/operands', 1429200827636),
(-108, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//NotFilter', 1429200827636),
(-107, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ExpressionFilter/expression', 1429200827636),
(-106, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ExpressionFilter', 1429200827636),
(-105, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ResourceFilter/includeRoot', 1429200827636),
(-104, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ResourceFilter/includeParents', 1429200827636),
(-103, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ResourceFilter/modelObjects', 1429200827636),
(-102, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ResourceFilter/modelResources', 1429200827636),
(-101, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ResourceFilter/binaryResources', 1429200827636),
(-100, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ResourceFilter/textResources', 1429200827636),
(-99, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ResourceFilter/folders', 1429200827636),
(-98, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ResourceFilter/patternStyle', 1429200827636),
(-97, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ResourceFilter/path', 1429200827636),
(-96, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ResourceFilter', 1429200827636),
(-95, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ClassFilter/subTypes', 1429200827636),
(-94, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ClassFilter/applicableClass', 1429200827636),
(-93, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ClassFilter', 1429200827636),
(-92, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//PackageFilter/applicablePackage', 1429200827636),
(-91, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//PackageFilter', 1429200827636),
(-90, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//LinkedFilter/filter', 1429200827636),
(-89, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//LinkedFilter', 1429200827636),
(-88, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//FilterPermission/filters', 1429200827636),
(-87, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//FilterPermission', 1429200827636),
(-86, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ResourcePermission/pattern', 1429200827636),
(-85, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ResourcePermission', 1429200827636),
(-84, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//PackagePermission/applicablePackage', 1429200827636),
(-83, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//PackagePermission', 1429200827636),
(-82, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ClassPermission/applicableClass', 1429200827636),
(-81, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Permission/access', 1429200827636),
(-80, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Permission/role', 1429200827636),
(-79, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//ClassPermission', 1429200827636),
(-78, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//UserPassword/encrypted', 1429200827636),
(-77, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//UserPassword', 1429200827636),
(-76, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//User/password', 1429200827636),
(-75, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//User/locked', 1429200827636),
(-74, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//User/defaultAccessOverride', 1429200827636),
(-73, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//User/email', 1429200827636),
(-72, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//User/lastName', 1429200827636),
(-71, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//User/firstName', 1429200827636),
(-70, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//User/groups', 1429200827636),
(-69, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//User', 1429200827636),
(-68, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Group/inheritingGroups', 1429200827636),
(-67, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Group/inheritedGroups', 1429200827636),
(-66, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Group/users', 1429200827636),
(-65, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Assignee/roles', 1429200827636),
(-64, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Assignee/id', 1429200827636),
(-63, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Group', 1429200827636),
(-62, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Role/assignees', 1429200827636),
(-61, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Role/permissions', 1429200827636),
(-60, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Role/id', 1429200827636),
(-59, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Role', 1429200827636),
(-58, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Directory/name', 1429200827636),
(-57, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Directory/items', 1429200827636),
(-56, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Directory', 1429200827636),
(-55, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Realm/defaultRoleDirectory', 1429200827636),
(-54, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Realm/defaultGroupDirectory', 1429200827636),
(-53, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Realm/defaultUserDirectory', 1429200827636),
(-52, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Realm/defaultAccess', 1429200827636),
(-51, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Realm/name', 1429200827636),
(-50, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Realm/items', 1429200827636),
(-49, 'http://www.eclipse.org/emf/CDO/Etypes/4.0.0#//ModelElement/annotations', 1429200827636),
(-48, 'http://www.eclipse.org/emf/CDO/security/4.1.0#//Realm', 1429200827636),
(-47, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//ListConstruction/elements', 1429200827636),
(-46, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//ListConstruction', 1429200827636),
(-45, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//LinkedExpression/expression', 1429200827636),
(-44, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//LinkedExpression', 1429200827636),
(-43, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//LinkedObject/object', 1429200827636),
(-42, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//LinkedObject', 1429200827636),
(-41, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//ContainedObject/object', 1429200827636),
(-40, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//ContainedObject', 1429200827636),
(-39, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//ContextAccess', 1429200827636),
(-38, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//MemberAccess/object', 1429200827636),
(-37, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//MemberAccess', 1429200827636),
(-36, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//Access/name', 1429200827636),
(-35, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//StaticAccess', 1429200827636),
(-34, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//MemberInvocation/object', 1429200827636),
(-33, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//MemberInvocation', 1429200827636),
(-32, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//Invocation/name', 1429200827636),
(-31, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//Invocation/arguments', 1429200827636),
(-30, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//FunctionInvocation', 1429200827636),
(-29, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//StringValue/literal', 1429200827636),
(-28, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//StringValue', 1429200827636),
(-27, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//CharValue/literal', 1429200827636),
(-26, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//CharValue', 1429200827636),
(-25, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//DoubleValue/literal', 1429200827636),
(-24, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//DoubleValue', 1429200827636),
(-23, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//FloatValue/literal', 1429200827636),
(-22, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//FloatValue', 1429200827636),
(-21, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//LongValue/literal', 1429200827636),
(-20, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//LongValue', 1429200827636),
(-19, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//IntValue/literal', 1429200827636),
(-18, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//IntValue', 1429200827636),
(-17, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//ShortValue/literal', 1429200827636),
(-16, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//ShortValue', 1429200827636),
(-15, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//ByteValue/literal', 1429200827636),
(-14, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//ByteValue', 1429200827636),
(-13, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//BooleanValue/literal', 1429200827636),
(-12, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0#//BooleanValue', 1429200827636),
(-11, 'http://www.eclipse.org/emf/CDO/Eresource/4.0.0#//CDOTextResource/encoding', -1),
(-10, 'http://www.eclipse.org/emf/CDO/Eresource/4.0.0#//CDOTextResource/contents', -1),
(-9, 'http://www.eclipse.org/emf/CDO/Eresource/4.0.0#//CDOTextResource', -1),
(-8, 'http://www.eclipse.org/emf/CDO/Eresource/4.0.0#//CDOBinaryResource/contents', -1),
(-7, 'http://www.eclipse.org/emf/CDO/Eresource/4.0.0#//CDOBinaryResource', -1),
(-6, 'http://www.eclipse.org/emf/CDO/Eresource/4.0.0#//CDOResource/contents', -1),
(-5, 'http://www.eclipse.org/emf/CDO/Eresource/4.0.0#//CDOResource', -1),
(-4, 'http://www.eclipse.org/emf/CDO/Eresource/4.0.0#//CDOResourceFolder/nodes', -1),
(-3, 'http://www.eclipse.org/emf/CDO/Eresource/4.0.0#//CDOResourceNode/name', -1),
(-2, 'http://www.eclipse.org/emf/CDO/Eresource/4.0.0#//CDOResourceNode/folder', -1),
(-1, 'http://www.eclipse.org/emf/CDO/Eresource/4.0.0#//CDOResourceFolder', -1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `CDO_LOBS`
--

CREATE TABLE IF NOT EXISTS `CDO_LOBS` (
  `ID` longtext COLLATE utf8_bin NOT NULL,
  `LSIZE` bigint(20) DEFAULT NULL,
  `BDATA` longblob,
  `CDATA` longtext COLLATE utf8_bin,
  PRIMARY KEY (`ID`(64))
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `CDO_LOCKS`
--

CREATE TABLE IF NOT EXISTS `CDO_LOCKS` (
  `AREA_ID` longtext COLLATE utf8_bin NOT NULL,
  `OBJECT_ID` bigint(20) NOT NULL,
  `LOCK_GRADE` int(11) DEFAULT NULL,
  PRIMARY KEY (`AREA_ID`(255),`OBJECT_ID`),
  KEY `I1429200823868_16` (`AREA_ID`(255))
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `CDO_LOCK_AREAS`
--

CREATE TABLE IF NOT EXISTS `CDO_LOCK_AREAS` (
  `ID` longtext COLLATE utf8_bin NOT NULL,
  `USER_ID` longtext COLLATE utf8_bin,
  `VIEW_BRANCH` int(11) DEFAULT NULL,
  `VIEW_TIME` bigint(20) DEFAULT NULL,
  `READ_ONLY` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ID`(255)),
  KEY `I1429200823490_14` (`USER_ID`(255))
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `CDO_OBJECTS`
--

CREATE TABLE IF NOT EXISTS `CDO_OBJECTS` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_CLASS` bigint(20) DEFAULT NULL,
  `CDO_CREATED` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `CDO_OBJECTS`
--

INSERT INTO `CDO_OBJECTS` (`CDO_ID`, `CDO_CLASS`, `CDO_CREATED`) VALUES
(1, -5, 1429200824535),
(2, -5, 1429200827636),
(3, -48, 1429200827636),
(4, -56, 1429200827636),
(5, -59, 1429200827636),
(6, -87, 1429200827636),
(7, -96, 1429200827636),
(8, -59, 1429200827636),
(9, -87, 1429200827636),
(10, -96, 1429200827636),
(11, -59, 1429200827636),
(12, -87, 1429200827636),
(13, -91, 1429200827636),
(14, -59, 1429200827636),
(15, -87, 1429200827636),
(16, -91, 1429200827636),
(17, -59, 1429200827636),
(18, -87, 1429200827636),
(19, -96, 1429200827636),
(20, -87, 1429200827636),
(21, -96, 1429200827636),
(22, -56, 1429200827636),
(23, -63, 1429200827636),
(24, -63, 1429200827636),
(25, -56, 1429200827636),
(26, -69, 1429200827636),
(27, -77, 1429200827636),
(28, -59, 1429200848341),
(29, -87, 1429200848341),
(30, -96, 1429200848341),
(31, -87, 1429200848341),
(32, -96, 1429200848341),
(33, -1, 1429200848341),
(34, -1, 1429200848341),
(35, -69, 1429200908443),
(36, -1, 1429200908550),
(37, -77, 1429200957818),
(38, -69, 1429200981177),
(39, -1, 1429200981295),
(40, -69, 1429200996297),
(41, -1, 1429200996385),
(42, -77, 1429201063729),
(43, -77, 1429201102478),
(44, -77, 1429201129437),
(45, -59, 1429252732802),
(46, -87, 1429252900453),
(47, -96, 1429252900453),
(48, -87, 1429252900453),
(49, -96, 1429252900453),
(50, -87, 1429252900453),
(51, -96, 1429252900453);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `CDO_PACKAGE_INFOS`
--

CREATE TABLE IF NOT EXISTS `CDO_PACKAGE_INFOS` (
  `URI` longtext COLLATE utf8_bin NOT NULL,
  `PARENT` longtext COLLATE utf8_bin,
  `UNIT` longtext COLLATE utf8_bin,
  PRIMARY KEY (`URI`(255)),
  KEY `I1429200820562_4` (`PARENT`(255)),
  KEY `I1429200820562_5` (`UNIT`(255))
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `CDO_PACKAGE_INFOS`
--

INSERT INTO `CDO_PACKAGE_INFOS` (`URI`, `PARENT`, `UNIT`) VALUES
('http://www.eclipse.org/emf/2002/Ecore', NULL, 'http://www.eclipse.org/emf/2002/Ecore'),
('http://www.eclipse.org/emf/CDO/Eresource/4.0.0', NULL, 'http://www.eclipse.org/emf/CDO/Eresource/4.0.0'),
('http://www.eclipse.org/emf/CDO/Etypes/4.0.0', NULL, 'http://www.eclipse.org/emf/CDO/Etypes/4.0.0'),
('http://www.eclipse.org/emf/CDO/expressions/4.3.0', NULL, 'http://www.eclipse.org/emf/CDO/expressions/4.3.0'),
('http://www.eclipse.org/emf/CDO/security/4.1.0', NULL, 'http://www.eclipse.org/emf/CDO/security/4.1.0');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `CDO_PACKAGE_UNITS`
--

CREATE TABLE IF NOT EXISTS `CDO_PACKAGE_UNITS` (
  `ID` longtext COLLATE utf8_bin NOT NULL,
  `ORIGINAL_TYPE` int(11) DEFAULT NULL,
  `TIME_STAMP` bigint(20) DEFAULT NULL,
  `PACKAGE_DATA` longblob,
  PRIMARY KEY (`ID`(255))
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `CDO_PACKAGE_UNITS`
--

INSERT INTO `CDO_PACKAGE_UNITS` (`ID`, `ORIGINAL_TYPE`, `TIME_STAMP`, `PACKAGE_DATA`) VALUES
('http://www.eclipse.org/emf/2002/Ecore', 1, 1429200824535, 0x504b0304140008080800b6819046000000000000000000000000100000005265736f75726365436f6e74656e7473dd5c5b6fdb36147eefaf30dcbdd66abb97214832348953784d9622498701c31e189976d4caa24b494eb25f3fde44521225511225bbdd4b17993cfc78ee3c3cd2f1efcf9b70b283380e5074327d377b3b9dc0c847cb205a9f4cbfdc5fbef96dfafbe9ab63e8230c8fe69f81ff0dace1e479131cc949efe92442268a8fc8f393e963926c8f3cefe9e9698636eb19c26befefeb851c12e7873cfdca46bc7ffbf61d197675e73fc20d7813447102221f4e5f4dc87f7c26c3909b0bfd30d8c69011809b1525f2de9bd361d34904366430147fc45f6e17f653e3cf18ae82e76cfa2901710ccf4310c7c12a20db9e904d1c252fdb6c81a339fb315b74fe214970f090268416bc4bb710df93b1f1c9f4b5e7cdef129cfa498a41780901f99793a70b947e31aca351e66b0517648d7b3684523f432884209a7a6d88dec215c490723be39a5c86529e4e42f404f1194aa32551112e12fa9fb6ee0548001feb3f82680dc143487e598130268f76280449401f1030e4ef0483280e6094640f9610073bb8147f32ecc79ecef0f6128822949045516410c1355ac2701ec20d81d08ffb314a31659bc6094287d84e4f012c610282906c27dd6e25e7df9859cf17bc47fcdf6bb09d47097e2182401121126d343e93c551b8839f317a0e2833b87c7aea4a8e9b3ab0dc0f127949f866501378b3dda238480cc43ca8c41bf7844fb94448dab1fae6e12bf493d1588bb307add0b9301ff157c972140969373764049744e6916239eb6665744ea702fd31fc0c309993504499416d60b6b89ac89f64ccf4b4352b51ac6122387d4e989657cc459428c998661a9c74c1e28c2edcb8a3151fb2b8a884d0723f064acdcb37e06f0b650006fd49fea873a4b6d0e4b32e72970f73f3d4d39a6da06c900349dfd4d0b2815081be350c92e2e160097b30c31112a1463cc3d0287e8411491d7cf67c5023e8941d808798443b3fe99fa195d33e12b5f00a14720f47d99ff2fa567147f8eb348a6192f0c44fe571dd512821d8453fa572d6e1b99864481a247a721ac403e5834fd7843a0ca50cedf6a389bc434a2d291a52eb5ebbb86d979368340e66173fc1167e0e5d3a5776fa038b220c7b78aa03da4579a25aabb0abfa386ab1abead3a0f35d758a658e8a18dd912f2ef41a92c99225fafe5887a90b18f4c9b29c51d2a7aef1bc44cb795c1709684b2dd3d3d672de345ae586984719bf8dcde7f03bb67617950b5ea19864f977b65aa99c41cf9ccb6221d050d05864d5e896d50c24ea45daac3fc00ee8859a168720b5b59a2366d7e304df205ba2ea242ec558742ffd32ff7a3026fdaa04d2a05f4a529a024f34ed5222e26b9fca958e193b3ee075cab2154f92f2745a52a0e57df7e2c812ae401a267f81308555dae4301eb8111f4539b22a955d9cb8b0ca61c89ed571acc4a14264113472beaa2f568a50b910ab40929b620a1c2e5caabadbb1a90777bb4721fa07c2e03f2a03a393d5b25e650a57441c641d875b9d47e9c6b04dc981dae2219d2c20e5f6a03faf091691a302685f1cbb9297e952c2d4573b7be90127344cb5e04c37131478ec8c2fc7e7ce39aa46c5834cff5c29b262ba55ded3c970eb95a55f0029690b9531c2d5e964bf652d14ada35609af92df4cbbf063af4b9e5262178a7449f26744af93ed6ed14baec0c78451851b049eb0d4d8bc9b2b40bef425461b21c68acca90e8816fbd45cf9d06bf65be59cad8b5b27de650771925df29be80db38bcc166b534ff77e58a66dcd9d277268479b91999cd07479d673613df9de88c279b4367ce61a58b4fa8f7a5c7b8bded496e24e547a2b86552d5adb58e7a0a98878f9fe131742cb45c7e62282bb6ea2da0cb0e7a672becea0738d2ed73065115331bdd45f4196a7dd42837eca87351345ed8e9e742ada5e6ae71156da352b3493a2b236d152e6d140835d7958d623e657419c54d722ca13f21ca92c5258c49dec96a60ddc7b0ce12211b9da7e509f6314c7da35df0fc0e88fb0b24e386e77cf18488c1484e7aff526763bb88303438de053e784c8e446efa0b9476464c97fa1c5b7b1175d443bf4ad929313387ff6e196cdc8ce973be43312f700d34c29fbdd413f92712ec8ec3fe7195a3992eafab1d967b0a70a48053ffb66041a4f8a390dfddfe68b91864eb5ea1018c4596b59b70ed1a6363df7596ef1dab09c270d709c6784f53d1c6c85b9cf49af159c5a28d6273e4143636def128ff452f66d06e296d2f59587f0262d1139bd92eee999d4a54db70b5b1a15740e9b19efb814dfedc447df4bea5d713490e52f300d50cb2c56492c2a34b284d8d10d8af99eac0af5dc827e65d7d6580d766072da6cb433c077e9c39653b27592c27e9ad1caea17b3346778355a83ddbcea5c71e3756468b1cb877ab63557e42e03e4115a5bb3166e5df04cdbded02f3a6aba3c403fbd6f2c2d956e9ff7dd5b919777af9bf23e1acc95aba9f2d5b33b9ba722cde1e5505a363fc197b6ddd82e4cd0d02f5928590b0cdd0f79d52f9ed5be4d25cbb5f966aae1bbaf1c25674aa34631b4f2ddba50df01dc9db48401681bd8e13ec3fda13ae2d4716a107633a043bc07b6cfa287a17bdc85b7ccf9bc8e0dc29dc484301154859806f72469147c4ff7e4c5540077dc26a4226d8970fda6def55c780322f39de7c1381c0cbfa741a3b6ed3d63e2199ef9a42d510edd219c2b7c5514c4ecc18c5b28abfaf447a99dff64fa95c4c5594ab0cfc8b05ff8b85e3af60dbeb80febe57642872d10e597c50fe4658f6e8afbc5ecff8c7a3bd61b45b934bd7ddd792c98b7e0a9d5e9322bfe5924394e1de4953976ee5dc47aa9aceaaa48021b04457379df55b6585716ec9c1e9637c4a43cb8c9b4e687ea1c152c390bd617d00f36f4505715663620799c690333ce68ad8213deed253fc9e6b1efb0f16fb2b1efb1b1f53d1ab0bcf97302a3255c5ec304503cca098bcf644d482c3a993e805864142c8a347f64eef552e053be5943e88c5d2421856baa3e4decca061e2abb02816f487689306be2d5432e041f1e7b1e4abd4a43b127eb8da952a89084a9d9d97ed955ac411427f02bd6c2e0a352b2e49e852f34db34a917fde16075eb25814373e503c6c07c76a0abfff3efc132e7113e9f051120079a81396467777bd423aedd761647468e606ee78fc01cf97cfa83d79524f0494266250e397a6f3239973b6d92091d39824c2e40850b54350236a493742e02b08e509c043ed94d608ee484cbf2fbbb84cb331f6d3628122b17e60bb6e92f08e733dab6f850caeaf006584bfed3a1ba39016f48c5602b5899d5c55e799549d1caaaf8d811ec8a77fdb655783eab46cd331ee70ea359d169eeea5ca7bd5fdb7a07a557739d59ab38415f83ad152a468683d2660e07aabadc6a854c94619de30b1130ebe18afd72a80e8ea31bd0401963acdcdbe53e19250468e5dcd8d0117c1bbd5533b12c880e579f82686896d07288953eedb9b4a3dfb6d6eb1319388236a91e9f86e45deb03aa0880f7ae02a0fed2512da8dc67d65b2e7285e8cbfb06f22192aff01f9e21317003aa03e58a15ebaff6c8252e3b2b23a22347b0a2aaac2877d5db39b3fca4ae688cbfffe5caf0d4ebe0d6791416536672aeeb1c2a23ccdeccec8e8b4e770dedee116133a898fd72a85e84a31bd01e1863acfcc8dd3e19250468e549d8d0115c49f659997aaee91f9a3940fd2abea3e59c4bb92f1bb43d25e726effdb85ffd1675bd0e60b80a892eceaae7d7bbbb634f2012aff19cbefa1f504b070843babe25770a0000826c0000504b01021400140008080800b681904643babe25770a0000826c00001000000000000000000000000000000000005265736f75726365436f6e74656e7473504b050600000000010001003e000000b50a00000000),
('http://www.eclipse.org/emf/CDO/Eresource/4.0.0', 0, 1429200824535, 0x504b0304140008080800b6819046000000000000000000000000100000005265736f75726365436f6e74656e7473d558516fe238107eefaf8872fbdaa4eddd4a27045d01853b2476a9a05dddab3103f535b123db81f67efd8d4d120c242c84ee6e175545c49e996f663e7b66d2fcf41247de12a46282b7fcebe0caf7805331637cd1f21f1ffa977ffa9f6e2f9a40858446ef9ed067b200ef25668d42e8c608a11aae1af8bce53f699d34c270b55a05225e04422ec27f3e0f8a2d6a7bcbea77bbe3e6eaea1ab70d27f4096272c9b8d28453f02f3cfcac252d862d59a0114b14580510cf8d929bb067b6f91e27316e06094aa4929a07ea713c3828debd1b85bd5c20fc23b842c7ac7daeee25ccd98babef16579ad08d88526cce30161e7ad6d0af89b1ba8e965dcc91a0f27126fb45cc100f992a2d09d52d5fcb74adcf689ce02faa5349a23e10fc8612c5639823104e0b37e7229a81c4d43dd86dbf85a163aebf5eb4facdc7b8102de15e8a17060a8549a450138c924428a62be4438ea8951f9e82b3adb564d3541738cdff0265b6e98e68621e784110e2df268788a28756908959708cd936e742138dc453de1a5e654a4d3aef3a136de8705b78df9c81262c52de33bcb67c2aa234e6c6bcef2d4994a2b6afed71f7eff638f7b44a66087ca19f0aa99b8f1f3712cdd0c599452c2c09d959c14c88b17f7a300bb79622428411640cf4908e5c31e039253d4c3b5bc22cfb69dd43371cce9f7108fa3965276902d26056bbc4b3e7240fd1087765795feb22b3d99eae03f4df50e89e4854a00ddaf358191699dd803b066e05d0f700f1015e7405ccada57700b5c33891af156077167f30dc5a77f8fa7ef5d204d57544caf1d85d5e6f0e6b2965d695840a8ed7138f9d937bea1d6f1485591579db737ef0840f81cc4faa7c7b97605e8f27a05d0a8c9dc7450877efb7f36a593a1eb8161fcdcf9d1bb5d272d9cd5a9b3826fda8fadbdc7133554aedd1f45fa0fa04429d17c118db4c64d3eca4e3d7112202c2bf5756234166e722a24f842f804c0d0fb2837744a99d9334d25f4d3731c4038aa87749740667f6dc349de7335e639f6d0aa8bdbede531a404a218fba0def185970a134a37e9dc07f97e8ae88e418dc5f16bf66310a923839891243e13697a57c78b3aa620bc7ee08f5cd5e32ac61b18fc1dfd4b2132c6ed536b363aff5188c3679daeb7016a0bbc5c51e895541a36ba79bf90b38a69dda94386e95e6ab67dc54ebb116910ec5d49d8a2cc2b65ca4e6d257de36e0dc353716e106bdcdab03a5a2333a3bf9a54d5d4d8ad38ad856d4cc0381ec4418c93dbad79a58b3971095d36a625eb92883bb983bddd35e63f0ccb2b661f1368df6d3ee38b6c398d3e837e049aa111790d869a5f7e0bc096f4a26979fce9aeeafcc9a7a253d7bad78ceb0f5f3f83a0652cc466f48d5dc621e24776ef1f297a056c317bb8ef92e728f790fac9a201f828292b147214a12b1ffdcaee2983ab88bccce374720a2228e050f526c5a022353c796db13d50fc20747cde16060dab6de6fdf5efc0f504b070856829a302704000018170000504b01021400140008080800b681904656829a3027040000181700001000000000000000000000000000000000005265736f75726365436f6e74656e7473504b050600000000010001003e000000650400000000),
('http://www.eclipse.org/emf/CDO/Etypes/4.0.0', 0, 1429200824535, 0x504b0304140008080800b6819046000000000000000000000000100000005265736f75726365436f6e74656e7473b5565d6fda30147de75744de3331b03d4c8850b534959060a042a5bd9ae442dd2576643b40f7eb776d922ce910151f43481137f7dc7bee39fe6070b74f136f0b4a732902d2f53bc40311c9988b4d405e964fedefe46ed81a402415f4c3398b7eb10d78fb94f72b50cf82b08cd07d8c07e4d598ac4fe96eb7f365baf1a5dad09fd37195a29b29bbaf2ea3d7e974316db2885e21656d2eb4612202d2f2f073403a0e0d2c4409cf34b80290ae6d911e0d6d1af1044b3119cc7b061a7fe997e7f149ece8714643974dbff91d1cc975167aae60cdf755a5218607304a98d67ccd51020f07eadb77987210c9bd2c094c650c4998400ac2108fadb4512c3201312a0757cc969b65a09841317581da80b917421a17444796aefe174a6bd103d8c2e74c21ca583207b896b942ed4a5cc1eb911966039eef53fcfe150beb860ba3d072420b4ab4c6a9648929796472c5922760f88423b33fc31a1458e30a2aac228c92e419167d90b98803d2ee926200eff87c5e2485615c58e50abd3cec29932dcc95dc73d00159b344db3967592635371f6bd0b4aebe9b0d27ab9977ae9b0d5316394e63996bd7b6e1f4399add1bd47e959b4ab3ebedbbccab1850efe4739feaca9c60b39487e79465a130eafd98a355e9e3ce5e374fc3fdda226b38f509830f6bab0ea5f5b57d1d532b0c56bc81f4b3d51b44e68ccd731d7155066e47fdb26d5aee8e92d8432257c42baf1107fde15ee0795f9dfd78eefb512cfd48a6a9143e427cbc061cb460af417196f0df6c954043b133e98c2ea733fa0f742617b3999c26532e26dbec9f6b693cbb91b96391e506d72bb0f4e8186f6ccb7c2efd7ade8d157c0616833ad9bd4839dd18b568fcb51ab6fe00504b07085683de857002000093090000504b01021400140008080800b68190465683de8570020000930900001000000000000000000000000000000000005265736f75726365436f6e74656e7473504b050600000000010001003e000000ae0200000000),
('http://www.eclipse.org/emf/CDO/expressions/4.3.0', 0, 1429200827636, 0x504b0304140008080800b7819046000000000000000000000000100000005265736f75726365436f6e74656e7473dd985d4fdb301486eff91551764d4c611753d51641291253191505b45bd73d493d1cbbb29db6ecd7ef385fa4856db40d2c1a42a03af639cffbfa243d71e774150b6f01da7025bb7e2b38f23d904c4db98cbafefddde5e117ffb477d001a634b40723ca1e6904de2ae6ed72d1b15b8461a469e378d79f593b6f13b25c2e03154781d211f97e7d554e31eb539627e98ce3a3a3164e1b8ed90c627ac8a5b15432f00f3cfcc956a60c6b6b81093e379006803874418ec9c04df33d49639c0cabb906e3380d0e99fbdbab3f06e85fdc90ca12f239384171298334230d215fadc7ece1b50ef405c5cf2147473cd4d7b64f73973bf32cbd58f00ccab5be4727c66aca6cd7b73a41622e2de89032c8077a69de0edccc4153ebd215a2165424d4e212b8ab66baa096ba012f0808fe3ebbf18990c157baa037931fc06c1ed8851e518d11ade3ce423385102b5b46762bb36c98bf9f5f243919a9a0a54690aa13db5af38069e0a52b304e3089a33119ceb383bf3528023be4a88a8a5d2d22fbeb39574a0095b9ac4d19d970a1608c5a994d10f81228fe8757829f59abf924b1656d8b1d24e650b5e87bb2d03071485487b2f14c69db2c6929521ddaae64c39421501dba864a46cd12e688ea507629146dd89ea5487568bb50c94434ec299231d5a1ae3fa3ba59da1c512d4f486469dafd9631d5f38c5c289636143bb5236f517c0b2168700d6e9e93ea2889415a8448e698e15c2572daf50f5b7edeac79d596acd245ba8e8d72e9d6168c784d89058cb45a7187195261a0ecda76e3737f7d4fa86589d6f25f272a79b723dbf3219948e636acba759b5b55b946b68d7f0df104f41ba3ef65b4ca1ad00dab6b2d82fdac3e630cdca78fba331a5e79638b9bce0a53364dc8c777acb7bf44fdbfeb2c7fdbacdbd97e2601a6f99bdebbd56d61f0fa5758caf2eaf757cef34f8a78c8e563631da94d5fb592df4b2354726c736bd522d258ac6e9362bfaf48011fd0ab6ced46d11e96876d2f4eaebce25c318df32dab4a1d95e7801087019baaa072c417bc8c92ab34a03915fc27c5d7850a3862af1d96f60e7e01504b0708b2982974ff02000065150000504b01021400140008080800b7819046b2982974ff020000651500001000000000000000000000000000000000005265736f75726365436f6e74656e7473504b050600000000010001003e0000003d0300000000),
('http://www.eclipse.org/emf/CDO/security/4.1.0', 0, 1429200827636, 0x504b0304140008080800b7819046000000000000000000000000100000005265736f75726365436f6e74656e7473ed5add53db38107fef5fe1f13d37067a0f370ca19316b79799b63021bdebab626f82aeb2e4916420ff7d57f2674c0c766c42b829c3c0585eedfef643bb2b5967efef23e6dc825454f0b17b3c3a721de08108295f8dddeff34f6fff72df9fbf3983404838f5af48f093acc0b98fe86931e9c44c42365c9de2f8d8bdd13a3ef5bcbbbbbb918856232157de8fafd382446d92dcbdb314274747c748f6e53ab88188bca55c69c20370df38f893ceb41836e642c068acc032806869989c78be21731d4e222456102492ea353eabefb3e9a3b33f5e5c7a39bdf7e7c8d8c24ae7ea4ac292de57b89de38b33f8c888527449d1100eaa75aad7318acc4c655fe630aeb3893e8308b8761db2505a92408f5d2d13440bd7490c728e0cd4d81d8d3cdff05288e26874f487e77d1521b07cf2b9457506973883687481caa4ac40cf80b0c87598b803f941243c449f22f7b945868cd2f79ec5ef5515d855a3a986e80975506c5d7fafabb84cafa7f8e6a699702e74661b251219b48e9b9403f2084113ca94f313d663374046a820e51a11dd129620bfbf899a8411e5d4bcd142a64a59bb56c4e788aed130814e24619f80e07fd8a2f10c9620c1447da63545e3a2c0248e0b6fbe3d7633844ec5ad9bde40b4889d1b8be40e417982ddc29514f7d4d86e49988202f16ee80863df15baae0d404388c06e085f015930c81138b782a1a1cc400a146dc915ad200f41d25b08b3c7de883f4b91c4ad205bca83c03c130c5a4136840781f80a644495290fad7097e43ba12f38f6d062a2b5a48b44175a98bf45e6cc882e882666c0c10c8dbf65da401d7c948245b3a7d4109624617a120460925f69a274e472f11f04baa77f321966495e5089fc845c5745958383c8b1eba8e4b9c5fd030b34aba08d62fd0a6055424355b2d9f8ff5300865d22fdac9f66bac10cff40351a3efbda7fe0ecb847d26ceb7007bbc658288cab1a0f4f1a8bf64cfcc869c5a15dad9a64c47548f9b805a48688955252db36f575c68fecd6266c9add8c79a50307307bd63fd56d5c78639fbdfa2458239b60ca6fb043483796c377eb49b76678d3fe66cc5ba5cd69bf30a0a99210766e753711d9412fe386d1f979407025bb41d015baf66e5ca73b1bef00baeee9eec63d00f42fb3cbe997e3b295fc548adbc924ab2116489a93fab5798c2c80ed52ce0aa87b8eae071a2ca954fadb8b6ce8305a5e48324458135f78077b790b52d210b636803bef6877dc351f4c383211fc846e0de20781498ff0be3b0c4c5d7742866ead19b9cac74b13eded08f177a9fa7d20d7aebde6d9f6247cad9d42b1ccfae5751ec875ac3b2690e18e5eaab151db50f7debe3ef6e5cabc2e7cdcea74c3ee69aba72afdd236c9cacb26c4c6ca6682c896a57fcc1ef40b82427163f7dfd974ee0fe107fb507546bd0dadbceb973ee218f7ce66fd64f21f374015ebd6504cb90c1189e9d7e8fdda2013dadb0a399f210e43213d377906433c580431d118c8fc85724fdac93d92811ed3bbf347e74f94a1aefb08afa595d4bcb46aa56e6ba54ed1763dfc1faa16e4d26bfee86cf32f94636f9c736bb677463180d55b24f40762874b5efbd1f4a0d3977dd8b71d062f653b6754952cacba3bed072b9df6965e63a8e6352f30cfe2a46d25e666ffe7165961bbd66b061b09b63afeb8b9e733dfef7b522558680bc133c6c2cee034dceb3c140e14e2827222d7070e3232b7f95e03c6b4dd3a508494072c09b1a061863f708c3321f401a7f7d4cd0d1ddcd3c9be738fe7dfc768be6ad75897b181a857c5874256d7625fce34f770dfd97bb87e85dbc33efb89d389215a251161862bfbe3cebeea654b612e1cf3f0f56d53be09dd1469358b768ee5096fdcacf4657d2907e4ecf3242ab71e9596268f882cabe477c9fd1f938ff332fbd5deda4e27bf5c71dc4836f9362fa84e1aa966fe67ff4741f76e47875715cc0ee01ae54d2e1ac1a4c77335d53a83c993fb26a0ec3b548b8b2f9ebded92de7cb1b75e2c5f2fd194610ed2c04308bf8226464ec33598f4725e71ffc5c83fddfcd8569fb1200a52d01bb39a6fcad4cd72e665ea679bc3f337bf00504b07087b6e53d6cf0500005f320000504b01021400140008080800b78190467b6e53d6cf0500005f3200001000000000000000000000000000000000005265736f75726365436f6e74656e7473504b050600000000010001003e0000000d0600000000);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `CDO_PROPERTIES`
--

CREATE TABLE IF NOT EXISTS `CDO_PROPERTIES` (
  `NAME` longtext COLLATE utf8_bin NOT NULL,
  `VALUE` mediumtext COLLATE utf8_bin,
  PRIMARY KEY (`NAME`(255))
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `CDO_PROPERTIES`
--

INSERT INTO `CDO_PROPERTIES` (`NAME`, `VALUE`) VALUES
('org.eclipse.emf.cdo.server.db.repositoryCreated', '1429200824535'),
('org.eclipse.emf.cdo.server.db.schemaVersion', '4');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `ERESOURCE_CDOBINARYRESOURCE`
--

CREATE TABLE IF NOT EXISTS `ERESOURCE_CDOBINARYRESOURCE` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `FOLDER` bigint(20) DEFAULT NULL,
  `NAME` longtext COLLATE utf8_bin,
  `CONTENTS` longtext COLLATE utf8_bin,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200824972_25` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `ERESOURCE_CDORESOURCE`
--

CREATE TABLE IF NOT EXISTS `ERESOURCE_CDORESOURCE` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `FOLDER` bigint(20) DEFAULT NULL,
  `NAME` longtext COLLATE utf8_bin,
  `CONTENTS` int(11) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200824971_22` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `ERESOURCE_CDORESOURCE`
--

INSERT INTO `ERESOURCE_CDORESOURCE` (`CDO_ID`, `CDO_VERSION`, `CDO_BRANCH`, `CDO_CREATED`, `CDO_REVISED`, `CDO_RESOURCE`, `CDO_CONTAINER`, `CDO_FEATURE`, `FOLDER`, `NAME`, `CONTENTS`) VALUES
(1, 1, 0, 1429200824535, 1429200827635, 1, 0, 0, NULL, NULL, 0),
(1, 2, 0, 1429200827636, 1429200848340, 1, 0, 0, NULL, NULL, 1),
(1, 3, 0, 1429200848341, 0, 1, 0, 0, NULL, NULL, 2),
(2, 1, 0, 1429200827636, 0, 1, 0, 0, NULL, 'security', 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `ERESOURCE_CDORESOURCEFOLDER`
--

CREATE TABLE IF NOT EXISTS `ERESOURCE_CDORESOURCEFOLDER` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `FOLDER` bigint(20) DEFAULT NULL,
  `NAME` longtext COLLATE utf8_bin,
  `NODES` int(11) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200824937_19` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `ERESOURCE_CDORESOURCEFOLDER`
--

INSERT INTO `ERESOURCE_CDORESOURCEFOLDER` (`CDO_ID`, `CDO_VERSION`, `CDO_BRANCH`, `CDO_CREATED`, `CDO_REVISED`, `CDO_RESOURCE`, `CDO_CONTAINER`, `CDO_FEATURE`, `FOLDER`, `NAME`, `NODES`) VALUES
(33, 1, 0, 1429200848341, 1429200908549, 1, 0, 0, NULL, 'home', 1),
(33, 2, 0, 1429200908550, 1429200981294, 1, 0, 0, NULL, 'home', 2),
(33, 3, 0, 1429200981295, 1429200996384, 1, 0, 0, NULL, 'home', 3),
(33, 4, 0, 1429200996385, 0, 1, 0, 0, NULL, 'home', 4),
(34, 1, 0, 1429200848341, 0, 0, 33, 0, NULL, 'Administrator', 0),
(36, 1, 0, 1429200908550, 0, 0, 33, 0, NULL, 'CactoScale', 0),
(39, 1, 0, 1429200981295, 0, 0, 33, 0, NULL, 'CactoOpt', 0),
(41, 1, 0, 1429200996385, 0, 0, 33, 0, NULL, 'CactoSim', 0);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `ERESOURCE_CDORESOURCEFOLDER_NODES_LIST`
--

CREATE TABLE IF NOT EXISTS `ERESOURCE_CDORESOURCEFOLDER_NODES_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `ERESOURCE_CDORESOURCEFOLDER_NODES_LIST`
--

INSERT INTO `ERESOURCE_CDORESOURCEFOLDER_NODES_LIST` (`CDO_SOURCE`, `CDO_BRANCH`, `CDO_VERSION`, `CDO_IDX`, `CDO_VALUE`) VALUES
(33, 0, 1, 0, 34),
(33, 0, 2, 0, 34),
(33, 0, 2, 1, 36),
(33, 0, 3, 0, 34),
(33, 0, 3, 1, 36),
(33, 0, 3, 2, 39),
(33, 0, 4, 0, 34),
(33, 0, 4, 1, 36),
(33, 0, 4, 2, 39),
(33, 0, 4, 3, 41);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `ERESOURCE_CDORESOURCE_CONTENTS_LIST`
--

CREATE TABLE IF NOT EXISTS `ERESOURCE_CDORESOURCE_CONTENTS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `ERESOURCE_CDORESOURCE_CONTENTS_LIST`
--

INSERT INTO `ERESOURCE_CDORESOURCE_CONTENTS_LIST` (`CDO_SOURCE`, `CDO_BRANCH`, `CDO_VERSION`, `CDO_IDX`, `CDO_VALUE`) VALUES
(1, 0, 2, 0, 2),
(1, 0, 3, 0, 2),
(1, 0, 3, 1, 33),
(2, 0, 1, 0, 3);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `ERESOURCE_CDOTEXTRESOURCE`
--

CREATE TABLE IF NOT EXISTS `ERESOURCE_CDOTEXTRESOURCE` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `FOLDER` bigint(20) DEFAULT NULL,
  `NAME` longtext COLLATE utf8_bin,
  `CONTENTS` longtext COLLATE utf8_bin,
  `ENCODING` longtext COLLATE utf8_bin,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200824974_27` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_BOOLEANVALUE`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_BOOLEANVALUE` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `LITERAL` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827696_29` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_BYTEVALUE`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_BYTEVALUE` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `LITERAL` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827712_31` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_CHARVALUE`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_CHARVALUE` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `LITERAL` char(1) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827733_43` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_CONTAINEDOBJECT`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_CONTAINEDOBJECT` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `OBJECT` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827743_59` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_CONTEXTACCESS`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_CONTEXTACCESS` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `NAME` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827742_57` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_DOUBLEVALUE`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_DOUBLEVALUE` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `LITERAL` double DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827732_41` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_FLOATVALUE`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_FLOATVALUE` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `LITERAL` float DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827730_39` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_FUNCTIONINVOCATION`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_FUNCTIONINVOCATION` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `ARGUMENTS` int(11) DEFAULT NULL,
  `NAME` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827736_47` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_FUNCTIONINVOCATION_ARGUMENTS_LIST`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_FUNCTIONINVOCATION_ARGUMENTS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_INTVALUE`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_INTVALUE` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `LITERAL` int(11) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827727_35` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_LINKEDEXPRESSION`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_LINKEDEXPRESSION` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `EXPRESSION` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827746_63` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_LINKEDOBJECT`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_LINKEDOBJECT` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `OBJECT` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827745_61` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_LISTCONSTRUCTION`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_LISTCONSTRUCTION` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `ELEMENTS` int(11) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827747_65` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_LISTCONSTRUCTION_ELEMENTS_LIST`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_LISTCONSTRUCTION_ELEMENTS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_LONGVALUE`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_LONGVALUE` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `LITERAL` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827729_37` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_MEMBERACCESS`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_MEMBERACCESS` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `NAME` bigint(20) DEFAULT NULL,
  `OBJECT` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827741_55` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_MEMBERINVOCATION`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_MEMBERINVOCATION` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `ARGUMENTS` int(11) DEFAULT NULL,
  `NAME` bigint(20) DEFAULT NULL,
  `OBJECT` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827738_50` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_MEMBERINVOCATION_ARGUMENTS_LIST`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_MEMBERINVOCATION_ARGUMENTS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_SHORTVALUE`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_SHORTVALUE` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `LITERAL` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827726_33` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_STATICACCESS`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_STATICACCESS` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `NAME` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827739_53` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `EXPRESSIONS_STRINGVALUE`
--

CREATE TABLE IF NOT EXISTS `EXPRESSIONS_STRINGVALUE` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `LITERAL` longtext COLLATE utf8_bin,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827734_45` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_ANDFILTER`
--

CREATE TABLE IF NOT EXISTS `SECURITY_ANDFILTER` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `OPERANDS` int(11) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827799_117` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_ANDFILTER_OPERANDS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_ANDFILTER_OPERANDS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_CLASSFILTER`
--

CREATE TABLE IF NOT EXISTS `SECURITY_CLASSFILTER` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `APPLICABLECLASS` bigint(20) DEFAULT NULL,
  `SUBTYPES` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827787_108` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_CLASSPERMISSION`
--

CREATE TABLE IF NOT EXISTS `SECURITY_CLASSPERMISSION` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `ROLE` bigint(20) DEFAULT NULL,
  `ACCESS` int(11) DEFAULT NULL,
  `APPLICABLECLASS` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827771_95` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_DIRECTORY`
--

CREATE TABLE IF NOT EXISTS `SECURITY_DIRECTORY` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `ANNOTATIONS` int(11) DEFAULT NULL,
  `ITEMS` int(11) DEFAULT NULL,
  `NAME` longtext COLLATE utf8_bin,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827754_72` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_DIRECTORY`
--

INSERT INTO `SECURITY_DIRECTORY` (`CDO_ID`, `CDO_VERSION`, `CDO_BRANCH`, `CDO_CREATED`, `CDO_REVISED`, `CDO_RESOURCE`, `CDO_CONTAINER`, `CDO_FEATURE`, `ANNOTATIONS`, `ITEMS`, `NAME`) VALUES
(4, 1, 0, 1429200827636, 1429200848340, 0, 3, -2, 0, 5, 'Roles'),
(4, 2, 0, 1429200848341, 1429252732801, 0, 3, -2, 0, 6, 'Roles'),
(4, 3, 0, 1429252732802, 0, 0, 3, -2, 0, 7, 'Roles'),
(22, 1, 0, 1429200827636, 0, 0, 3, -2, 0, 2, 'Groups'),
(25, 1, 0, 1429200827636, 1429200908442, 0, 3, -2, 0, 1, 'Users'),
(25, 2, 0, 1429200908443, 1429200981176, 0, 3, -2, 0, 2, 'Users'),
(25, 3, 0, 1429200981177, 1429200996296, 0, 3, -2, 0, 3, 'Users'),
(25, 4, 0, 1429200996297, 0, 0, 3, -2, 0, 4, 'Users');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_DIRECTORY_ANNOTATIONS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_DIRECTORY_ANNOTATIONS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_DIRECTORY_ITEMS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_DIRECTORY_ITEMS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_DIRECTORY_ITEMS_LIST`
--

INSERT INTO `SECURITY_DIRECTORY_ITEMS_LIST` (`CDO_SOURCE`, `CDO_BRANCH`, `CDO_VERSION`, `CDO_IDX`, `CDO_VALUE`) VALUES
(4, 0, 1, 0, 5),
(4, 0, 1, 1, 8),
(4, 0, 1, 2, 11),
(4, 0, 1, 3, 14),
(4, 0, 1, 4, 17),
(4, 0, 2, 0, 5),
(4, 0, 2, 1, 8),
(4, 0, 2, 2, 11),
(4, 0, 2, 3, 14),
(4, 0, 2, 4, 17),
(4, 0, 2, 5, 28),
(4, 0, 3, 0, 5),
(4, 0, 3, 1, 8),
(4, 0, 3, 2, 11),
(4, 0, 3, 3, 14),
(4, 0, 3, 4, 17),
(4, 0, 3, 5, 28),
(4, 0, 3, 6, 45),
(22, 0, 1, 0, 23),
(22, 0, 1, 1, 24),
(25, 0, 1, 0, 26),
(25, 0, 2, 0, 26),
(25, 0, 2, 1, 35),
(25, 0, 3, 0, 26),
(25, 0, 3, 1, 35),
(25, 0, 3, 2, 38),
(25, 0, 4, 0, 26),
(25, 0, 4, 1, 35),
(25, 0, 4, 2, 38),
(25, 0, 4, 3, 40);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_EXPRESSIONFILTER`
--

CREATE TABLE IF NOT EXISTS `SECURITY_EXPRESSIONFILTER` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `EXPRESSION` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827796_112` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_FILTERPERMISSION`
--

CREATE TABLE IF NOT EXISTS `SECURITY_FILTERPERMISSION` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `ROLE` bigint(20) DEFAULT NULL,
  `ACCESS` int(11) DEFAULT NULL,
  `FILTERS` int(11) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827783_101` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_FILTERPERMISSION`
--

INSERT INTO `SECURITY_FILTERPERMISSION` (`CDO_ID`, `CDO_VERSION`, `CDO_BRANCH`, `CDO_CREATED`, `CDO_REVISED`, `CDO_RESOURCE`, `CDO_CONTAINER`, `CDO_FEATURE`, `ROLE`, `ACCESS`, `FILTERS`) VALUES
(6, 1, 0, 1429200827636, 0, 0, 5, 0, NULL, 0, 1),
(9, 1, 0, 1429200827636, 0, 0, 8, 0, NULL, 1, 1),
(12, 1, 0, 1429200827636, 0, 0, 11, 0, NULL, 0, 1),
(15, 1, 0, 1429200827636, 0, 0, 14, 0, NULL, 1, 1),
(18, 1, 0, 1429200827636, 0, 0, 17, 0, NULL, 1, 1),
(20, 1, 0, 1429200827636, 0, 0, 17, 0, NULL, 0, 1),
(29, 1, 0, 1429200848341, 0, 0, 28, 0, NULL, 1, 1),
(31, 1, 0, 1429200848341, 0, 0, 28, 0, NULL, 0, 1),
(46, 1, 0, 1429252900453, 0, 0, 45, 0, NULL, 1, 1),
(48, 1, 0, 1429252900453, 0, 0, 45, 0, NULL, 1, 1),
(50, 1, 0, 1429252900453, 0, 0, 45, 0, NULL, 1, 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_FILTERPERMISSION_FILTERS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_FILTERPERMISSION_FILTERS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_FILTERPERMISSION_FILTERS_LIST`
--

INSERT INTO `SECURITY_FILTERPERMISSION_FILTERS_LIST` (`CDO_SOURCE`, `CDO_BRANCH`, `CDO_VERSION`, `CDO_IDX`, `CDO_VALUE`) VALUES
(6, 0, 1, 0, 7),
(9, 0, 1, 0, 10),
(12, 0, 1, 0, 13),
(15, 0, 1, 0, 16),
(18, 0, 1, 0, 19),
(20, 0, 1, 0, 21),
(29, 0, 1, 0, 30),
(31, 0, 1, 0, 32),
(46, 0, 1, 0, 47),
(48, 0, 1, 0, 49),
(50, 0, 1, 0, 51);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_GROUP`
--

CREATE TABLE IF NOT EXISTS `SECURITY_GROUP` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `ANNOTATIONS` int(11) DEFAULT NULL,
  `ID` longtext COLLATE utf8_bin,
  `ROLES` int(11) DEFAULT NULL,
  `USERS` int(11) DEFAULT NULL,
  `INHERITEDGROUPS` int(11) DEFAULT NULL,
  `INHERITINGGROUPS` int(11) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827759_81` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_GROUP`
--

INSERT INTO `SECURITY_GROUP` (`CDO_ID`, `CDO_VERSION`, `CDO_BRANCH`, `CDO_CREATED`, `CDO_REVISED`, `CDO_RESOURCE`, `CDO_CONTAINER`, `CDO_FEATURE`, `ANNOTATIONS`, `ID`, `ROLES`, `USERS`, `INHERITEDGROUPS`, `INHERITINGGROUPS`) VALUES
(23, 1, 0, 1429200827636, 0, 0, 22, -2, 0, 'Administrators', 1, 1, 0, 0),
(24, 1, 0, 1429200827636, 0, 0, 22, -2, 0, 'Users', 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_GROUP_ANNOTATIONS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_GROUP_ANNOTATIONS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_GROUP_INHERITEDGROUPS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_GROUP_INHERITEDGROUPS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_GROUP_INHERITINGGROUPS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_GROUP_INHERITINGGROUPS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_GROUP_ROLES_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_GROUP_ROLES_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_GROUP_ROLES_LIST`
--

INSERT INTO `SECURITY_GROUP_ROLES_LIST` (`CDO_SOURCE`, `CDO_BRANCH`, `CDO_VERSION`, `CDO_IDX`, `CDO_VALUE`) VALUES
(23, 0, 1, 0, 17);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_GROUP_USERS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_GROUP_USERS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_GROUP_USERS_LIST`
--

INSERT INTO `SECURITY_GROUP_USERS_LIST` (`CDO_SOURCE`, `CDO_BRANCH`, `CDO_VERSION`, `CDO_IDX`, `CDO_VALUE`) VALUES
(23, 0, 1, 0, 26);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_LINKEDFILTER`
--

CREATE TABLE IF NOT EXISTS `SECURITY_LINKEDFILTER` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `FILTER` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827785_104` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_NOTFILTER`
--

CREATE TABLE IF NOT EXISTS `SECURITY_NOTFILTER` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `OPERANDS` int(11) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827798_114` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_NOTFILTER_OPERANDS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_NOTFILTER_OPERANDS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_ORFILTER`
--

CREATE TABLE IF NOT EXISTS `SECURITY_ORFILTER` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `OPERANDS` int(11) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827800_120` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_ORFILTER_OPERANDS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_ORFILTER_OPERANDS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_PACKAGEFILTER`
--

CREATE TABLE IF NOT EXISTS `SECURITY_PACKAGEFILTER` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `APPLICABLEPACKAGE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827786_106` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_PACKAGEFILTER`
--

INSERT INTO `SECURITY_PACKAGEFILTER` (`CDO_ID`, `CDO_VERSION`, `CDO_BRANCH`, `CDO_CREATED`, `CDO_REVISED`, `CDO_RESOURCE`, `CDO_CONTAINER`, `CDO_FEATURE`, `APPLICABLEPACKAGE`) VALUES
(13, 1, 0, 1429200827636, 0, 0, 12, -3, -112),
(16, 1, 0, 1429200827636, 0, 0, 15, -3, -112);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_PACKAGEPERMISSION`
--

CREATE TABLE IF NOT EXISTS `SECURITY_PACKAGEPERMISSION` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `ROLE` bigint(20) DEFAULT NULL,
  `ACCESS` int(11) DEFAULT NULL,
  `APPLICABLEPACKAGE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827773_97` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_REALM`
--

CREATE TABLE IF NOT EXISTS `SECURITY_REALM` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `ANNOTATIONS` int(11) DEFAULT NULL,
  `ITEMS` int(11) DEFAULT NULL,
  `NAME` longtext COLLATE utf8_bin,
  `DEFAULTACCESS` longtext COLLATE utf8_bin,
  `DEFAULTUSERDIRECTORY` bigint(20) DEFAULT NULL,
  `DEFAULTGROUPDIRECTORY` bigint(20) DEFAULT NULL,
  `DEFAULTROLEDIRECTORY` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827749_68` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_REALM`
--

INSERT INTO `SECURITY_REALM` (`CDO_ID`, `CDO_VERSION`, `CDO_BRANCH`, `CDO_CREATED`, `CDO_REVISED`, `CDO_RESOURCE`, `CDO_CONTAINER`, `CDO_FEATURE`, `ANNOTATIONS`, `ITEMS`, `NAME`, `DEFAULTACCESS`, `DEFAULTUSERDIRECTORY`, `DEFAULTGROUPDIRECTORY`, `DEFAULTROLEDIRECTORY`) VALUES
(3, 1, 0, 1429200827636, 0, 2, 0, 0, 0, 3, 'Security Realm', NULL, 25, 22, 4);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_REALM_ANNOTATIONS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_REALM_ANNOTATIONS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_REALM_ITEMS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_REALM_ITEMS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_REALM_ITEMS_LIST`
--

INSERT INTO `SECURITY_REALM_ITEMS_LIST` (`CDO_SOURCE`, `CDO_BRANCH`, `CDO_VERSION`, `CDO_IDX`, `CDO_VALUE`) VALUES
(3, 0, 1, 0, 4),
(3, 0, 1, 1, 22),
(3, 0, 1, 2, 25);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_RESOURCEFILTER`
--

CREATE TABLE IF NOT EXISTS `SECURITY_RESOURCEFILTER` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `PATH` longtext COLLATE utf8_bin,
  `PATTERNSTYLE` int(11) DEFAULT NULL,
  `FOLDERS` tinyint(1) DEFAULT NULL,
  `TEXTRESOURCES` tinyint(1) DEFAULT NULL,
  `BINARYRESOURCES` tinyint(1) DEFAULT NULL,
  `MODELRESOURCES` tinyint(1) DEFAULT NULL,
  `MODELOBJECTS` tinyint(1) DEFAULT NULL,
  `INCLUDEPARENTS` tinyint(1) DEFAULT NULL,
  `INCLUDEROOT` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827790_110` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_RESOURCEFILTER`
--

INSERT INTO `SECURITY_RESOURCEFILTER` (`CDO_ID`, `CDO_VERSION`, `CDO_BRANCH`, `CDO_CREATED`, `CDO_REVISED`, `CDO_RESOURCE`, `CDO_CONTAINER`, `CDO_FEATURE`, `PATH`, `PATTERNSTYLE`, `FOLDERS`, `TEXTRESOURCES`, `BINARYRESOURCES`, `MODELRESOURCES`, `MODELOBJECTS`, `INCLUDEPARENTS`, `INCLUDEROOT`) VALUES
(7, 1, 0, 1429200827636, 0, 0, 6, -3, '.*', 3, 1, 1, 1, 1, 1, 1, 1),
(10, 1, 0, 1429200827636, 0, 0, 9, -3, '.*', 3, 1, 1, 1, 1, 1, 1, 1),
(19, 1, 0, 1429200827636, 0, 0, 18, -3, '/security', 0, 1, 1, 1, 1, 1, 0, 1),
(21, 1, 0, 1429200827636, 0, 0, 20, -3, '/security', 0, 1, 1, 1, 1, 1, 1, 1),
(30, 1, 0, 1429200848341, 0, 0, 29, -3, '/home/${user}', 1, 1, 1, 1, 1, 1, 0, 1),
(32, 1, 0, 1429200848341, 0, 0, 31, -3, '/home', 0, 1, 1, 1, 1, 1, 1, 1),
(47, 1, 0, 1429252900453, 0, 0, 46, -3, '/uulm-testbed/plans', 0, 1, 1, 1, 1, 1, 1, 1),
(49, 1, 0, 1429252900453, 0, 0, 48, -3, '/qub-testbed/plans', 0, 1, 1, 1, 1, 1, 1, 1),
(51, 1, 0, 1429252900453, 0, 0, 50, -3, '/flexiant-testbed/plans', 0, 1, 1, 1, 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_RESOURCEPERMISSION`
--

CREATE TABLE IF NOT EXISTS `SECURITY_RESOURCEPERMISSION` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `ROLE` bigint(20) DEFAULT NULL,
  `ACCESS` int(11) DEFAULT NULL,
  `PATTERN` longtext COLLATE utf8_bin,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827782_99` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_ROLE`
--

CREATE TABLE IF NOT EXISTS `SECURITY_ROLE` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `ANNOTATIONS` int(11) DEFAULT NULL,
  `ID` longtext COLLATE utf8_bin,
  `PERMISSIONS` int(11) DEFAULT NULL,
  `ASSIGNEES` int(11) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827756_76` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_ROLE`
--

INSERT INTO `SECURITY_ROLE` (`CDO_ID`, `CDO_VERSION`, `CDO_BRANCH`, `CDO_CREATED`, `CDO_REVISED`, `CDO_RESOURCE`, `CDO_CONTAINER`, `CDO_FEATURE`, `ANNOTATIONS`, `ID`, `PERMISSIONS`, `ASSIGNEES`) VALUES
(5, 1, 0, 1429200827636, 1429200920883, 0, 4, -2, 0, 'All Objects Reader', 1, 0),
(5, 2, 0, 1429200920884, 1429201010047, 0, 4, -2, 0, 'All Objects Reader', 1, 1),
(5, 3, 0, 1429201010048, 1429201029914, 0, 4, -2, 0, 'All Objects Reader', 1, 2),
(5, 4, 0, 1429201029915, 0, 0, 4, -2, 0, 'All Objects Reader', 1, 3),
(8, 1, 0, 1429200827636, 1429200920883, 0, 4, -2, 0, 'All Objects Writer', 1, 0),
(8, 2, 0, 1429200920884, 1429201029914, 0, 4, -2, 0, 'All Objects Writer', 1, 1),
(8, 3, 0, 1429201029915, 1429252934797, 0, 4, -2, 0, 'All Objects Writer', 1, 2),
(8, 4, 0, 1429252934798, 0, 0, 4, -2, 0, 'All Objects Writer', 1, 1),
(11, 1, 0, 1429200827636, 1429200920883, 0, 4, -2, 0, 'Resource Tree Reader', 1, 0),
(11, 2, 0, 1429200920884, 1429201010047, 0, 4, -2, 0, 'Resource Tree Reader', 1, 1),
(11, 3, 0, 1429201010048, 1429201029914, 0, 4, -2, 0, 'Resource Tree Reader', 1, 2),
(11, 4, 0, 1429201029915, 0, 0, 4, -2, 0, 'Resource Tree Reader', 1, 3),
(14, 1, 0, 1429200827636, 1429200920883, 0, 4, -2, 0, 'Resource Tree Writer', 1, 0),
(14, 2, 0, 1429200920884, 1429201029914, 0, 4, -2, 0, 'Resource Tree Writer', 1, 1),
(14, 3, 0, 1429201029915, 1429252934797, 0, 4, -2, 0, 'Resource Tree Writer', 1, 2),
(14, 4, 0, 1429252934798, 0, 0, 4, -2, 0, 'Resource Tree Writer', 1, 1),
(17, 1, 0, 1429200827636, 0, 0, 4, -2, 0, 'Administration', 2, 1),
(28, 1, 0, 1429200848341, 1429200908549, 0, 4, -2, 0, 'Home Folder /home', 2, 1),
(28, 2, 0, 1429200908550, 1429200981294, 0, 4, -2, 0, 'Home Folder /home', 2, 2),
(28, 3, 0, 1429200981295, 1429200996384, 0, 4, -2, 0, 'Home Folder /home', 2, 3),
(28, 4, 0, 1429200996385, 0, 0, 4, -2, 0, 'Home Folder /home', 2, 4),
(45, 1, 0, 1429252732802, 1429252900452, 0, 4, -2, 0, 'WritePlans', 0, 0),
(45, 2, 0, 1429252900453, 1429252941611, 0, 4, -2, 0, 'WritePlans', 3, 0),
(45, 3, 0, 1429252941612, 0, 0, 4, -2, 0, 'WritePlans', 3, 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_ROLE_ANNOTATIONS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_ROLE_ANNOTATIONS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_ROLE_ASSIGNEES_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_ROLE_ASSIGNEES_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_ROLE_ASSIGNEES_LIST`
--

INSERT INTO `SECURITY_ROLE_ASSIGNEES_LIST` (`CDO_SOURCE`, `CDO_BRANCH`, `CDO_VERSION`, `CDO_IDX`, `CDO_VALUE`) VALUES
(5, 0, 2, 0, 35),
(5, 0, 3, 0, 35),
(5, 0, 3, 1, 40),
(5, 0, 4, 0, 35),
(5, 0, 4, 1, 40),
(5, 0, 4, 2, 38),
(8, 0, 2, 0, 35),
(8, 0, 3, 0, 35),
(8, 0, 3, 1, 38),
(8, 0, 4, 0, 35),
(11, 0, 2, 0, 35),
(11, 0, 3, 0, 35),
(11, 0, 3, 1, 40),
(11, 0, 4, 0, 35),
(11, 0, 4, 1, 40),
(11, 0, 4, 2, 38),
(14, 0, 2, 0, 35),
(14, 0, 3, 0, 35),
(14, 0, 3, 1, 38),
(14, 0, 4, 0, 35),
(17, 0, 1, 0, 23),
(28, 0, 1, 0, 26),
(28, 0, 2, 0, 26),
(28, 0, 2, 1, 35),
(28, 0, 3, 0, 26),
(28, 0, 3, 1, 35),
(28, 0, 3, 2, 38),
(28, 0, 4, 0, 26),
(28, 0, 4, 1, 35),
(28, 0, 4, 2, 38),
(28, 0, 4, 3, 40),
(45, 0, 3, 0, 38);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_ROLE_PERMISSIONS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_ROLE_PERMISSIONS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_ROLE_PERMISSIONS_LIST`
--

INSERT INTO `SECURITY_ROLE_PERMISSIONS_LIST` (`CDO_SOURCE`, `CDO_BRANCH`, `CDO_VERSION`, `CDO_IDX`, `CDO_VALUE`) VALUES
(5, 0, 1, 0, 6),
(5, 0, 2, 0, 6),
(5, 0, 3, 0, 6),
(5, 0, 4, 0, 6),
(8, 0, 1, 0, 9),
(8, 0, 2, 0, 9),
(8, 0, 3, 0, 9),
(8, 0, 4, 0, 9),
(11, 0, 1, 0, 12),
(11, 0, 2, 0, 12),
(11, 0, 3, 0, 12),
(11, 0, 4, 0, 12),
(14, 0, 1, 0, 15),
(14, 0, 2, 0, 15),
(14, 0, 3, 0, 15),
(14, 0, 4, 0, 15),
(17, 0, 1, 0, 18),
(17, 0, 1, 1, 20),
(28, 0, 1, 0, 29),
(28, 0, 1, 1, 31),
(28, 0, 2, 0, 29),
(28, 0, 2, 1, 31),
(28, 0, 3, 0, 29),
(28, 0, 3, 1, 31),
(28, 0, 4, 0, 29),
(28, 0, 4, 1, 31),
(45, 0, 2, 0, 46),
(45, 0, 2, 1, 48),
(45, 0, 2, 2, 50),
(45, 0, 3, 0, 46),
(45, 0, 3, 1, 48),
(45, 0, 3, 2, 50);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_USER`
--

CREATE TABLE IF NOT EXISTS `SECURITY_USER` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `ANNOTATIONS` int(11) DEFAULT NULL,
  `ID` longtext COLLATE utf8_bin,
  `ROLES` int(11) DEFAULT NULL,
  `GROUPS` int(11) DEFAULT NULL,
  `FIRSTNAME` longtext COLLATE utf8_bin,
  `LASTNAME` longtext COLLATE utf8_bin,
  `EMAIL` longtext COLLATE utf8_bin,
  `DEFAULTACCESSOVERRIDE` longtext COLLATE utf8_bin,
  `LOCKED` tinyint(1) DEFAULT NULL,
  `PASSWORD` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827764_88` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_USER`
--

INSERT INTO `SECURITY_USER` (`CDO_ID`, `CDO_VERSION`, `CDO_BRANCH`, `CDO_CREATED`, `CDO_REVISED`, `CDO_RESOURCE`, `CDO_CONTAINER`, `CDO_FEATURE`, `ANNOTATIONS`, `ID`, `ROLES`, `GROUPS`, `FIRSTNAME`, `LASTNAME`, `EMAIL`, `DEFAULTACCESSOVERRIDE`, `LOCKED`, `PASSWORD`) VALUES
(26, 1, 0, 1429200827636, 1429200848340, 0, 25, -2, 0, 'Administrator', 0, 1, NULL, NULL, NULL, NULL, 0, 27),
(26, 2, 0, 1429200848341, 1429201129436, 0, 25, -2, 0, 'Administrator', 1, 1, NULL, NULL, NULL, NULL, 0, 27),
(26, 3, 0, 1429201129437, 0, 0, 25, -2, 0, 'Administrator', 1, 1, NULL, NULL, NULL, NULL, 0, 44),
(35, 1, 0, 1429200908443, 1429200908549, 0, 25, -2, 0, 'CactoScale', 0, 0, NULL, NULL, NULL, NULL, 0, NULL),
(35, 2, 0, 1429200908550, 1429200920883, 0, 25, -2, 0, 'CactoScale', 1, 0, NULL, NULL, NULL, NULL, 0, NULL),
(35, 3, 0, 1429200920884, 1429200957817, 0, 25, -2, 0, 'CactoScale', 5, 0, NULL, NULL, NULL, NULL, 0, NULL),
(35, 4, 0, 1429200957818, 0, 0, 25, -2, 0, 'CactoScale', 5, 0, NULL, NULL, NULL, NULL, 0, 37),
(38, 1, 0, 1429200981177, 1429200981294, 0, 25, -2, 0, 'CactoOpt', 0, 0, NULL, NULL, NULL, NULL, 0, NULL),
(38, 2, 0, 1429200981295, 1429201029914, 0, 25, -2, 0, 'CactoOpt', 1, 0, NULL, NULL, NULL, NULL, 0, NULL),
(38, 3, 0, 1429201029915, 1429201063728, 0, 25, -2, 0, 'CactoOpt', 5, 0, NULL, NULL, NULL, NULL, 0, NULL),
(38, 4, 0, 1429201063729, 1429252934797, 0, 25, -2, 0, 'CactoOpt', 5, 0, NULL, NULL, NULL, NULL, 0, 42),
(38, 5, 0, 1429252934798, 1429252941611, 0, 25, -2, 0, 'CactoOpt', 3, 0, NULL, NULL, NULL, NULL, 0, 42),
(38, 6, 0, 1429252941612, 0, 0, 25, -2, 0, 'CactoOpt', 4, 0, NULL, NULL, NULL, NULL, 0, 42),
(40, 1, 0, 1429200996297, 1429200996384, 0, 25, -2, 0, 'CactoSim', 0, 0, NULL, NULL, NULL, NULL, 0, NULL),
(40, 2, 0, 1429200996385, 1429201010047, 0, 25, -2, 0, 'CactoSim', 1, 0, NULL, NULL, NULL, NULL, 0, NULL),
(40, 3, 0, 1429201010048, 1429201102477, 0, 25, -2, 0, 'CactoSim', 3, 0, NULL, NULL, NULL, NULL, 0, NULL),
(40, 4, 0, 1429201102478, 0, 0, 25, -2, 0, 'CactoSim', 3, 0, NULL, NULL, NULL, NULL, 0, 43);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_USERPASSWORD`
--

CREATE TABLE IF NOT EXISTS `SECURITY_USERPASSWORD` (
  `CDO_ID` bigint(20) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_CREATED` bigint(20) NOT NULL,
  `CDO_REVISED` bigint(20) NOT NULL,
  `CDO_RESOURCE` bigint(20) NOT NULL,
  `CDO_CONTAINER` bigint(20) NOT NULL,
  `CDO_FEATURE` int(11) NOT NULL,
  `ENCRYPTED` longtext COLLATE utf8_bin,
  PRIMARY KEY (`CDO_ID`,`CDO_VERSION`,`CDO_BRANCH`),
  KEY `I1429200827769_93` (`CDO_ID`,`CDO_REVISED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_USERPASSWORD`
--

INSERT INTO `SECURITY_USERPASSWORD` (`CDO_ID`, `CDO_VERSION`, `CDO_BRANCH`, `CDO_CREATED`, `CDO_REVISED`, `CDO_RESOURCE`, `CDO_CONTAINER`, `CDO_FEATURE`, `ENCRYPTED`) VALUES
(27, -2, 0, 1429201129437, 0, 0, 0, 0, NULL),
(27, 1, 0, 1429200827636, 1429201129436, 0, 26, -12, '0000'),
(37, 1, 0, 1429200957818, 0, 0, 35, -12, 'SECRETPASS'),
(42, 1, 0, 1429201063729, 0, 0, 38, -12, 'SECRETPASS'),
(43, 1, 0, 1429201102478, 0, 0, 40, -12, 'SECRETPASS'),
(44, 1, 0, 1429201129437, 0, 0, 26, -12, 'SECRETPASS');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_USER_ANNOTATIONS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_USER_ANNOTATIONS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_USER_GROUPS_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_USER_GROUPS_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_USER_GROUPS_LIST`
--

INSERT INTO `SECURITY_USER_GROUPS_LIST` (`CDO_SOURCE`, `CDO_BRANCH`, `CDO_VERSION`, `CDO_IDX`, `CDO_VALUE`) VALUES
(26, 0, 1, 0, 23),
(26, 0, 2, 0, 23),
(26, 0, 3, 0, 23);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `SECURITY_USER_ROLES_LIST`
--

CREATE TABLE IF NOT EXISTS `SECURITY_USER_ROLES_LIST` (
  `CDO_SOURCE` bigint(20) NOT NULL,
  `CDO_BRANCH` int(11) NOT NULL,
  `CDO_VERSION` int(11) NOT NULL,
  `CDO_IDX` int(11) NOT NULL,
  `CDO_VALUE` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CDO_SOURCE`,`CDO_BRANCH`,`CDO_VERSION`,`CDO_IDX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `SECURITY_USER_ROLES_LIST`
--

INSERT INTO `SECURITY_USER_ROLES_LIST` (`CDO_SOURCE`, `CDO_BRANCH`, `CDO_VERSION`, `CDO_IDX`, `CDO_VALUE`) VALUES
(26, 0, 2, 0, 28),
(26, 0, 3, 0, 28),
(35, 0, 2, 0, 28),
(35, 0, 3, 0, 28),
(35, 0, 3, 1, 5),
(35, 0, 3, 2, 8),
(35, 0, 3, 3, 11),
(35, 0, 3, 4, 14),
(35, 0, 4, 0, 28),
(35, 0, 4, 1, 5),
(35, 0, 4, 2, 8),
(35, 0, 4, 3, 11),
(35, 0, 4, 4, 14),
(38, 0, 2, 0, 28),
(38, 0, 3, 0, 28),
(38, 0, 3, 1, 5),
(38, 0, 3, 2, 8),
(38, 0, 3, 3, 11),
(38, 0, 3, 4, 14),
(38, 0, 4, 0, 28),
(38, 0, 4, 1, 5),
(38, 0, 4, 2, 8),
(38, 0, 4, 3, 11),
(38, 0, 4, 4, 14),
(38, 0, 5, 0, 28),
(38, 0, 5, 1, 5),
(38, 0, 5, 2, 11),
(38, 0, 6, 0, 28),
(38, 0, 6, 1, 5),
(38, 0, 6, 2, 11),
(38, 0, 6, 3, 45),
(40, 0, 2, 0, 28),
(40, 0, 3, 0, 28),
(40, 0, 3, 1, 5),
(40, 0, 3, 2, 11),
(40, 0, 4, 0, 28),
(40, 0, 4, 1, 5),
(40, 0, 4, 2, 11);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
