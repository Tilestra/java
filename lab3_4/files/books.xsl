<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >
    <xsl:template match="/">
        <html>
            <body style="font-family:Arial;font-size:12pt;background-color:#EEEEEE">
                <xsl:for-each select="//book">
                    <xsl:sort select="cost"/>
                    <div style="background-color:teal;color:white;padding:4px">
                        <span style="font-weight:bold"><xsl:value-of select="pages"/> pages - <xsl:value-of select="cost"/> $ </span>
                    </div>
                    <div style="margin-left:20px;margin-bottom:1em;font-size:10pt">
                        <span style="font-style:italic"> Cover material - <xsl:value-of select="material"/></span>
                    </div>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>