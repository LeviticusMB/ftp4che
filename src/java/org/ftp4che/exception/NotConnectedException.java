/**                                                                         *
 *  This file is part of ftp4che.                                            *
 *                                                                           *
 *  This library is free software; you can redistribute it and/or modify it  *
 *  under the terms of the GNU General Public License as published    		*
 *  by the Free Software Foundation; either version 2 of the License, or     *
 *  (at your option) any later version.                                      *
 *                                                                           *
 *  This library is distributed in the hope that it will be useful, but      *
 *  WITHOUT ANY WARRANTY; without even the implied warranty of               *
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU        *
 *  General Public License for more details.                          		*
 *                                                                           *
 *  You should have received a copy of the GNU General Public		        *
 *  License along with this library; if not, write to the Free Software      *
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA  *
 *                                                                           *
 *****************************************************************************/
package org.ftp4che.exception;

import org.ftp4che.reply.ReplyCode;

/**
 * @author arnold
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class NotConnectedException extends FtpIOException {
    public NotConnectedException(String description) {
        super(ReplyCode.REPLY_530, description);
    }

}
