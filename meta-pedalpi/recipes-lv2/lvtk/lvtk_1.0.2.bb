DESCRIPTION = "LV2 Toolkit."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/lvtk/lvtk.git"
SRCREV = "7c0ffdf49baecf92137441065ac921a1e57d2ca9"
#SRCREV = "33b29873d64dbd23dcd5c1007e6d8a9e0c81d343"

S = "${WORKDIR}/git"
B = "${WORKDIR}/git/build"

DEPENDS = " gtkmm lv2 "

inherit waf pkgconfig

