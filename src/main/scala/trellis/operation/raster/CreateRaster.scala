package trellis.operation

import trellis.operation

import scala.math.{min, max}
import scala.util.Sorting
import trellis.RasterExtent
import trellis.raster.IntRaster
import trellis.process.{Results,Server}
import trellis.constant.NODATA

/**
 * Creates an empty raster object based on the given raster properties.
 */
case class CreateRaster(g:RasterExtentOperation) extends IntRasterOperation with SimpleOperation[IntRaster] {
  def childOperations = List(g)
  def _value(server:Server) = { IntRaster.createEmpty( server.run(g) ) }
  
}