# Standard pedalpi configuration defaults, inherited by all targets
#EXTRA_IMAGE_FEATURES ?= "debug-tweaks"
#USER_CLASSES ?= "buildstats image-mklibs image-prelink"
#PATCHRESOLVE ?= "noop"
LICENSE_FLAGS_WHITELIST  += "commercial"

# Enable fortran
FORTRAN_forcevariable = ",fortran"
RUNTIMETARGET_append_pn-gcc-runtime = " libquadmath"

#opengl
DISTRO_FEATURES_remove = " wayland pulseaudio opengl opengles egl bluez5 bluetooth pci pcmcia wifi 3g nfc"
#PACKAGECONFIG_pn-qtwebkit = " fontconfig "
#dbus
#PACKAGECONFIG_DEFAULT_pn-qtbase_remove = " udev evdev "
#PACKAGECONFIG_DEFAULT_pn-qtbase_append = " fontconfig freetype "

PACKAGECONFIG_DEFAULT_pn-projectm_remove = " ftgl "
#PACKAGECONFIG_DEFAULT_pn-gtk+3_append = " at-spi2-core at-spi2-atk dbus  "
#DEPENDS_pn-gtk+3_append = " cairo pango fribidi gdk-pixbuf dbus atk at-spi2-core at-spi2-atk "

#DEBUG_BUILD_pn-qtwebkit = "0"
#	${PACKAGECONFIG_CONFARGS}
#EXTRA_QMAKEVARS_PRE += "CONFIG+=-qt-zlib 

#             -no-dbus 
#QT_CONFIG_FLAGS_pn-qtbase_append = " -qt-zlib \
#             -qt-libpng \
#             -qt-libjpeg \
#             -qt-pcre \
#             -system-freetype \
#             -nomake examples \
#             -nomake tools \
#             -nomake tests \
#             -no-opengl \
#             -no-gstreamer\
#             -no-audio-backend \
#             -no-qml-debug \
#             -no-journald \
#             -no-sql-db2 \
#             -no-sql-ibase \
#             -no-sql-mysql \
#             -no-sql-oci \
#             -no-sql-odbc \
#             -no-sql-psql \
#             -no-sql-sqlite \
#             -no-sql-sqlite2 \
#             -no-sql-tds \
#             -no-tslib \
#	"
#FILES_${PN}-mkspecs = "\
#	${OE_QMAKE_PATH_ARCHDATA}/mkspecs"

PREFERRED_VERSION_python3-pillow = "5.1.0"

