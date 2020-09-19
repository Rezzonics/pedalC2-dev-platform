DESCRIPTION = "A module to control Odroid GPIO Raspberry Pi-like"
HOMEPAGE = "https://github.com/jfath/RPi.GPIO.Odroid"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE.txt;md5=9b95630a648966b142f1a0dcea001cb7"

COMPATIBLE_MACHINE = "hardkernel-odroidc2"

#SRCNAME = "RPi.GPIO.Odroid"

#SRCREV = "cbb7cc7549c0b6b90c405767b08e2958e049ab19"
SRC_URI = "git://github.com/jfath/RPi.GPIO.Odroid.git;protocol=git"
#S = "${WORKDIR}/${SRCNAME}-${PV}"
S = "${WORKDIR}/git"

inherit distutils3

