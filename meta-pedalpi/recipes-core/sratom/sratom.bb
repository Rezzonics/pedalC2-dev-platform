SUMMARY = "Sratom is a library for serialising LV2 atoms to and from RDF"
HOMEPAGE = "http://drobilla.net/software/sratom"
DESCRIPTION = "Sratom LV2 atom serialisation library."
LICENSE = "MIT" 
LIC_FILES_CHKSUM = "file://COPYING;md5=394d0c1b7157c45525c00dbf16afbe51"

inherit waf pkgconfig

SRC_URI = "git://git.drobilla.net/sratom.git;protocol=http"
SRCREV = "cc233a05de0690001ee2d067531bcc06248b751b"
#SRCREV = "84fc8bf02030425672fbf7b595ff6702e0a9e14a"

DEPENDS = " serd sord lv2 "

S = "${WORKDIR}/git/"
PV = "0.6.4"
