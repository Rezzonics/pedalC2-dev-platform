SUMMARY = "C library for RDF syntax which supports accessing Turtle and NTriples"
DESCRIPTION = "Serd RDF serialisation library."
HOMEPAGE = "http://drobilla.net/software/serd"
LICENSE = "MIT" 
LIC_FILES_CHKSUM = "file://COPYING;md5=7aceb3a3edc99517b08f5cdd557e11fb"

inherit waf pkgconfig

SRC_URI = " \
    git://git.drobilla.net/serd.git;protocol=http \
"

SRCREV = "221549c2580bb72ceb91cfff70e7295f65ce46bf"

S = "${WORKDIR}/git/"
PV = "0.30.3+git${SRCPV}"
