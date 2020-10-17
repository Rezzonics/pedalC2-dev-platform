DESCRIPTION = "lv2bm is a benchmark tool for LV2 plugins."
HOMEPAGE = "https://github.com/moddevices/lv2bm"
SECTION = "multimedia"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
inherit pkgconfig

DEPENDS = " lilv libsndfile1 glib-2.0 pkgconfig "

SRC_URI = "git://github.com/moddevices/lv2bm"
#           file://0001-Makefile-rewrite-build-options-for-external-invocati.patch
SRCREV = "ffd35a049c5f609f93460289dae0b319ad297810"
#SRCREV = "f728ad2f58ef638b1d662227a270f6841823f4d5"

S = "${WORKDIR}/git"
PV = "1.1.0"
EXTRA_OEMAKE = " PREFIX=${D}/${prefix}  "

INSANE_SKIP_${PN} = "ldflags"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

do_install() {
        oe_runmake install ${EXTRA_OEMAKE}
}
