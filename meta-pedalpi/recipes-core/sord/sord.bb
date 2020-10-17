DESCRIPTION = "Sord RDF data structure."
SUMMARY = "C library for storing RDF data in memory"
HOMEPAGE = "http://drobilla.net/software/sord"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=6b8d060e6d32fbd53684f9dc0443b6a3"

inherit waf pkgconfig

SRC_URI = "git://git.drobilla.net/sord.git;protocol=http"
SRCREV = "24ab5bbeb0dece32887d2702d786b76a877d0f59"
#SRCREV = "421e37d745f32454d507899bff8d63c101b3efa9"

DEPENDS += "serd libpcre"

S = "${WORKDIR}/git/"
PV = "0.16.4"

